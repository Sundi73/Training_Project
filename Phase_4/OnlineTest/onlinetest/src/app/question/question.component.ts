import { Component, OnInit } from '@angular/core';
import { interval } from 'rxjs';
import { QuestionService } from '../service/question.service';

@Component({
  selector: 'app-question',
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.scss']
})
export class QuestionComponent implements OnInit {

  public name : String="";
  public questionList : any = [];
  public currentQuestion : number = 0;
  public points: number = 0;
  counter = 30;
  correctAnswer = 0;
  inCorrectAnswer = 0;
  interval$:any;
  progress:String = "0";
  isQuizCompleted : boolean = false;
  constructor(private questionService : QuestionService) { }

  ngOnInit(): void {
    this.name = localStorage.getItem("name")!;
    this.getAllQuestions();
    this.startCounter();

  }

  getAllQuestions(){
    this.questionService.getQuestionJson()
    .subscribe(res=>
      {
      this.questionList = res.questions;
      })
  }

  nextQuestion(){
    this.currentQuestion++;
  }

  previousQuestion(){
    this.currentQuestion--;
  }

  answer(currentQn:number,option:any){
    if(currentQn===this.questionList.length){
      this.isQuizCompleted = true;
      this.stopCounter();
    }
    if(option.correct){
      this.points += 2 ;      
      this.correctAnswer++;
      setTimeout(() => {
      this.currentQuestion++;
      this.resetCounter();
      this.getProgressPercentage();
      }, 1000);
    }else{
      setTimeout(() => {
        this.inCorrectAnswer++;
        this.currentQuestion++;
        this.getProgressPercentage();
      }, 1000);
      this.points -= 2;
     
    }
  }

  startCounter(){
    this.interval$ = interval(1000)
    .subscribe(value=>{
      this.counter--;
      if(this.counter===0){
        this.currentQuestion++;
        this.counter=30;
        this.points -=2;
      }
    });
    setTimeout(()=>{
      this.interval$.unsubscribe()
    }, 300000)
  }
  stopCounter(){
    this.interval$.unsubscribe();
    this.counter=0;
  }
  resetCounter(){
    this.stopCounter();
    this.counter=30;
    this.startCounter();

  }

  resetQuiz(){
    this.getAllQuestions();
    this.resetCounter();
   this.currentQuestion=0;
    this.points=0;
    this.counter=30;
    this.getProgressPercentage();
  }

  getProgressPercentage(){
    this.progress = ((this.currentQuestion/this.questionList.length)*100)
    .toString();
    return this.progress;
  }
}
