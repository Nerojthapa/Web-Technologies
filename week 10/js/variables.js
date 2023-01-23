// diferents ways of variables declaration
var name = "niroj"
name = "saroj"
let name1="thapa"
name1="dai"
const name2="thapakaji"
console.log(typeof name);//type of function is used to know datatypes
console.log(typeof name1);
console.log(typeof name2);
var num0=100;
let num1=10;
let num2=20;
const num3=50;
console.log(typeof num1);
console.log(typeof num2);
console.log(typeof num0);
console.log(typeof mum3);
// user input
let number = prompt("enter a number:");
console.log(number);
let text = prompt("enter a text:");
console.log(text);
// changing css using DOM
document.getElementsByClassName("paragraph")[0].style.backgroundColor="red";
document.getElementsByClassName("paragraph")[2].style.cssText="background:blue; color: white; font-size:60px";//changing paragraph layout of same paragraph
document.getElementsByClassName("paragraph")[2].innerHTML="hi this is week 10!!!"; //changing paragraph text
document.getElementsByTagName("h1")[1].innerHTML="DOM getElementsByTagName example";//changing h1 