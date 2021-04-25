import { QuizService } from './../quiz.service';
import { Quiz } from './../quiz.model';
import { Component, OnInit } from '@angular/core';
import { ConstantPool } from '@angular/compiler';

@Component({
  selector: 'app-quiz',
  templateUrl: './quiz.component.html',
  styleUrls: ['./quiz.component.css']
})
export class QuizComponent implements OnInit {
quizzes:Quiz[];
currentQuiz=0;
correctAnswer=0;
incorrectAnswer=0;
answerSelected=false;
randomize:number;
result=false;
maxattempts=0;
abc="0";
localItem:string;
  constructor(private quizService:QuizService) {
    this.abc = "0";
    //localStorage.setItem("abc",JSON.stringify(this.abc));
    this.localItem=localStorage.getItem("abc");
    if(this.localItem==null)
    {
      this.abc="";
    }
    else{
      this.abc=JSON.parse(this.localItem);
    }
  }


  ngOnInit(): void {
  this.quizzes=this.quizService.getQuizzes();
  this.randomize=Math.floor(Math.random()*this.quizzes.length);
  }
  username:string;
  password:string;
onAnswer(correct:boolean)
{
  this.answerSelected=true;
  setTimeout(() => {
    this.currentQuiz++;
    this.answerSelected=false;
    this.randomize=Math.floor(Math.random()*this.quizzes.length);
    console.log(this.currentQuiz);
  }, 200);
  if(correct)
  {
    this.correctAnswer++;
  }
  else{
    this.incorrectAnswer++;
  }
}
showResult()
{ console.log(this.result);
  this.result=true;
  console.log(this.result);
}
maxa()
{
  this.maxattempts++;
  console.log(this.abc);
  console.log(this.maxattempts);
}
handleLogin()
{ this.abc="0";
  console.log(this.abc);

 if(this.username=="ankesh" && this.password=="ankesh")
  {this.abc="1";}
  else{
    this.abc="5";

  }
  localStorage.setItem("abc",JSON.stringify(this.abc));
}
backtologin()
{
  this.abc="0";
  localStorage.setItem("abc",JSON.stringify(this.abc));
  this.currentQuiz=0;
  this.username="";
  this.password="";
}

}
