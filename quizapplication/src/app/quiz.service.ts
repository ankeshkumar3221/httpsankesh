import { Injectable } from '@angular/core';
import { Quiz } from './quiz.model';

@Injectable({
  providedIn: 'root'
})
export class QuizService {
quizzes:Quiz[]=[
  {
    question:'Which of the following is not a Java features?',
    answer:[
      {option:'Dynamic',correct:false},
      {option:'Architecture Neutral',correct:false},
      {option:'Use of pointers',correct:true},
      {option:'Object-oriented',correct:false}
    ]
  },
  {
    question:' The \u0021 article referred to as a  ',
    answer:[
      {option:'Unicode escape sequence',correct:true},
      {option:'Octal escape',correct:false},
      {option:'Hexadecimal',correct:false},
      {option:'Line feed',correct:false}
    ]
  }
  ,
  {
    question:'Which of these class have only one field ‘TYPE’?',
    answer:[
      {option:'Void',correct:true},
      {option:'Process',correct:false},
      {option:'System',correct:false},
      {option:'Runtime',correct:false}
    ]
  }
  ,

  {
    question:'Which of these exceptions is thrown by methods of System class?',
    answer:[
      {option:'IOException',correct:false},
      {option:'SystemException',correct:false},
      {option:'SecurityException',correct:true},
      {option:'InputOutputException',correct:false}
    ]
  }
  ,
  {
    question:'Which of these is a method to clear all the data present in output buffers?',
    answer:[
      {option:'clear()',correct:false},
      {option:'flush()',correct:true},
      {option:'fflush()',correct:false},
      {option:'close()',correct:false}
    ]
  }
  ,
  {
    question:'Which is true?',
    answer:[
      {option:'"X extends Y" is correct if and only if X is a class and Y is an interface',correct:false},
      {option:'"X extends Y" is correct if and only if X is an interface and Y is a class',correct:false},
      {option:'"X extends Y" is correct if X and Y are either both classes or both interfaces',correct:true},
      {option:'"X extends Y" is correct for all combinations of X and Y being classes and/or interfaces',correct:false}
    ]
  }
  ,
  {
    question:'Java uses ___ type of memory to implement Recursion.',
    answer:[
      {option:'Heap',correct:false},
      {option:'Stack',correct:true},
      {option:'Register',correct:false},
      {option:'None',correct:false}
    ]
  }
  ,
  {
    question:'Who is known as father of Java Programming Language?',
    answer:[
      {option:'James Gosling',correct:true},
      {option:'M. P Java',correct:false},
      {option:'Charel Babbage',correct:false},
      {option:'Blais Pascal',correct:false}
    ]
  }
  ,
  {
    question:'In object-oriented programming, composition relates to',
    answer:[
      {option:'The use of consistent coding conventions',correct:false},
      {option:'The organization of components interacting to achieve a coherent, common behavior',correct:true},
      {option:'The use of inheritance to achieve polymorphic behavior',correct:false},
      {option:'The organization of components interacting not to achieve a coherent common behavior',correct:false},
      {option:'The use of data hiding to achieve polymorphic behavior.',correct:false}
    ]
  },
  {
    question:'Object-oriented inheritance models the',
    answer:[
      {option:'"is a kind of” relationship',correct:true},
      {option:'"has a" relationship',correct:false},
      {option:'“want to be” relationship',correct:false},
      {option:'inheritance does not describe any kind of relationship between classes',correct:false},
      {option:'“contains” of relationship.',correct:false}
    ]
  }

];

  constructor() { }
  getQuizzes(){
    return this.quizzes;
  }
}
