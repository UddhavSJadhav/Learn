//declaring same variable twice won't give u error
//eg.
var a = 1;
var a = "me";
console.log(a);
/**result will be 'me' without any error
 * this might create problem if u declare a important
 * variable again and change its value
 * debugging in large programs would be difficult
 */
//so let keyword is used in ES6
let camper = "James";
let camper = "David";
/**this will throw an error
 * let can be declared only once
 * "use strict" is used to catch unsafe actions.
 */
let catName;
let quote;
function catTalk() {
  "use strict";

  catName = "Oliver";
  quote = catName + " says Meow!";
}
catTalk();

//let keyword globally vs locally
function checkScope() {
  let i = "function scope";
  if (true) {
    let i = "block scope";
    console.log("Block scope i is: ", i); //#1
  }
  console.log("Function scope i is: ", i); //#2
  return i;
}
/**#1 will print "block scope" as i was local
 * #2 will print "function scope" as i was global
 */

/**const keyword
 * it has same features like let
 * but it can't be changed as it is a constant
 */
const lol = "laugh out loud";
lol = 1;
//will throw error
function printManyTimes(str) {
  const SENTENCE = str + " is cool!";
  for (let i = 0; i < str.length; i += 2) {
    console.log(SENTENCE);
  }
}
printManyTimes("freeCodeCamp");

//mutating const array
/**const as variable whole cannt be changed
 * but objects of const can be
 */
const s = [5, 7, 2];
function editInPlace() {
  // Using s = [2, 5, 7] would be invalid
  s[0] = 2;
  s[1] = 5;
  s[2] = 7;
}
editInPlace();

//Prevent object manipulation
//"Object.freeze" freezes the object and it can be
//no longer manipulated
let obj = {
  name: "FreeCodeCamp",
  review: "Awesome",
};
Object.freeze(obj);
obj.review = "bad";
obj.newProp = "Test";
console.log(obj);
/**The obj.review and obj.newProp assignments will
 * result in errors, and the console will display
 * the value { name: "FreeCodeCamp",
 *  review: "Awesome" }.*/

//Use Arrow Functions to Write Concise Anonymous Functions
const magic = () => new Date();

/***In order to help us create more flexible functions, ES6 introduces the rest parameter for function parameters.
 * With the rest parameter, you can create functions that take a variable number of arguments.
 * These arguments are stored in an array that can be accessed later from inside the function. */
const sum = (...args) => {
  return args.reduce((a, b) => a + b, 0);
};

/**
 * ES6 introduces the spread operator,
 *  which allows us to expand arrays and other expressions in places where multiple parameters or elements are expected.
 */
const arr = [6, 89, 3, 45];
const maximus = Math.max(...arr); //to find largest number
const arr1 = ["JAN", "FEB", "MAR", "APR", "MAY"];
let arr2;
arr2 = [...arr1]; // Change this line
console.log(arr2);
/**Destructuring assignment is special syntax introduced in ES6,
 * for neatly assigning values taken directly from an object. */
const user = { name: "John Doe", age: 34 };
const name = user.name;
const age = user.age;
//can also be written
const { name, age } = user;
//another view
const HIGH_TEMPERATURES = {
  yesterday: 75,
  today: 77,
  tomorrow: 80,
};
const { today: highToday, tomorrow: highTomorrow } = HIGH_TEMPERATURES; //to get only specific value. here, highToday = 77

//For nested objects
const LOCAL_FORECAST = {
  yesterday: { low: 61, high: 75 },
  today: { low: 64, high: 77 },
  tomorrow: { low: 68, high: 80 },
};
const {
  today: { low: lowToday, high: highToday },
} = LOCAL_FORECAST;

//ES6 makes destructuring arrays as easy as destructuring objects.
const [a, b, , , c] = [1, 2, 3, 4, 5, 6];
console.log(a, b, c);
// The console will display the values of a, b, and c as 1, 2, 5.
//swapping numbers
let a = 8,
  b = 6;
[a, b] = [b, a];

//In some situations involving array destructuring, we might want to collect the rest of the elements into a separate array.
const source = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
function removeFirstTwo(list) {
  const [a, b, ...arr] = list;
  return arr;
}
const arr = removeFirstTwo(source); //returns [3,4,...,10]

//you can destructure the object in a function argument itself.
const stats = {
  max: 56.78,
  standard_deviation: 4.34,
  median: 34.54,
  mode: 23.87,
  min: -0.75,
  average: 35.85,
};
const half = ({ max, min }) => (max + min) / 2.0;

//A new feature of ES6 is the template literal.
//This is a special type of string that makes creating complex strings easier.
const result = {
  success: ["max-length", "no-amd", "prefer-arrow-functions"],
  failure: ["no-var", "var-on-top", "linebreak"],
  skipped: ["no-extra-semi", "no-dup-keys"],
};
function makeList(arr) {
  // Only change code below this line
  const failureItems = [];
  for (let i = 0; i < arr.length; i++) {
    failureItems.push(`<li class="text-warning">${arr[i]}</li>`); //quotes are not used
  }
  // Only change code above this line

  return failureItems;
}
const failuresList = makeList(result.failure);
console.log(failuresList);

//ES6 adds some nice support for easily defining object literals.
const createPerson = (name, age, gender) => {
  return {
    name,
    age,
    gender,
  };
};
console.log(createPerson("Zodiac Hasbro", 56, "male")); //will return { name: 'Zodiac Hasbro', age: 56, gender: 'male' }

//no need to use function keywork to define function
const bicycle = {
  gear: 2,
  //defined function
  setGear(newGear) {
    this.gear = newGear;
  },
};
bicycle.setGear(3);
console.log(bicycle.gear);

//class in js is not actual like java and python
class Vegetable {
  constructor(name) {
    this.name = name;
  }
}
const carrot = new Vegetable("carrot");
console.log(carrot.name); // Should display 'carrot'

//Use getters and setters to Control Access to an Object
/**Use the class keyword to create a Thermostat class. The constructor accepts a Fahrenheit temperature.
In the class, create a getter to obtain the temperature in Celsius and a setter to set the temperature in Celsius. */
class Thermostat {
  constructor(temp) {
    this._temp = temp;
  }
  get temperature() {
    return (5 / 9) * (this._temp - 32);
  }
  set temperature(updatedTemp) {
    this._temp = (updatedTemp * 9.0) / 5 + 32;
  }
}
const thermos = new Thermostat(76); // Setting in Fahrenheit scale
let temp = thermos.temperature; // 24.44 in Celsius
thermos.temperature = 26;
temp = thermos.temperature; // 26 in Celsius

/**Imagine a file called math_functions.js that contains several functions related to mathematical operations.
 * One of them is stored in a variable, add, that takes in two numbers and returns their sum.
 *  You want to use this function in several different JavaScript files.
 * In order to share it with these other files, you first need to export it. */
const uppercaseString = (string) => {
  return string.toUpperCase();
};
const lowercaseString = (string) => {
  return string.toLowerCase();
};
export { uppercaseString, lowercaseString };

//import allows you to choose which parts of a file or module to load.
import { uppercaseString, lowercaseString } from "./string_functions.js";
uppercaseString("hello");
lowercaseString("WORLD!");

/**Suppose you have a file and you wish to import all of its contents into the current file.
 *  This can be done with the import * as syntax. */
import * as stringFunctions from "./string_functions.js";
stringFunctions.uppercaseString("hello");
stringFunctions.lowercaseString("WORLD!");

//Create an Export Fallback with export default
export default function subtract(x, y) {
  return x - y;
}

//Import a Default Export
import subtract from "./math_functions.js";
subtract(7, 4);

/**A promise in JavaScript is exactly what it sounds like - you use it to make a promise to do something,
 * usually asynchronously. When the task completes, you either fulfill your promise or fail to do so.
 * Promise is a constructor function, so you need to use the new keyword to create one.
 * It takes a function, as its argument, with two parameters - resolve and reject.
 * These are methods used to determine the outcome of the promise. */
// eg  const makeServerRequest = new Promise((resolve, reject) => {});
const makeServerRequest = new Promise((resolve, reject) => {
  // responseFromServer represents a response from a server
  let responseFromServer;
  if (responseFromServer) {
    resolve("We got the data");
  } else {
    reject("Data not received");
  }
});
makeServerRequest.then((result) => {
  console.log(result);
});
// The then method is executed immediately after your promise is fulfilled with resolve
makeServerRequest.catch((error) => {
  console.log(error);
});
//It is executed immediately after a promise's reject method is called.
