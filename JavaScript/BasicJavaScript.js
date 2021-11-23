// this is a in-line comment.

/* this is a
multi-line comment*/

//variable declaration
var Name;

//assigning value
Name = "Uddhav";

//direct assigning
var a = 1;
var b = 2;

//add variables
var c = a + b;

//Augmented additions
var c = 10 + c;
console.log(c); //to print value

c += 10;
console.log(c);

/* Escape Sequences in strings
    \'  single quote
    \"  double quote
    \\  backslash
    \n  newline
    \r  carriage return
    \t  tab
    \b  word boundary
    \f  form feed
*/
console.log(
  "to allow you ' to represent multiple \" quotes \\ in a \n string \r without \t JavaScript \b misinterpreting \f what you mean."
);

// All about strings
var myStr = "uddhav";
console.log(myStr.length); //find lenght of string

//find character in string
var myStrChar = myStr[0];

//find last character in string
var myStrLastChar = myStr[myStr.length - 1];

//Array
var sandWich = ["peanut butter", "jelly", "bread"];

//multi dimensional array or nested array
sandWich2 = [
  ["array", 0],
  ["array2", 1],
];

//modify array
sandWich2[0] = 15; //it can be directly

//add a value in array use push
//but it is added last in array
sandWich.push("berry");
sandWich2.push(["array3", 2]);

//removes last value of array
sandWich.pop();
var lastValue = sandWich.pop(); //assigned removed value

//removes first value of array
sandWich.shift();

//add a value in array from start
sandWich.unshift("First value");

//JS function
function functionName() {
  console.log("hello world");
}
functionName(); //function called

//function with argument or parametrs
function funcName(a, b) {
  console.log(a + b);
}
funcName(3, 4); //function called

/*global value
declared without var and can be declared inside
a function and used globally*/
oopsGlobal = 5;

// local vs global
var a = 1;
function myFun() {
  var a = 2;
  return a;
}
/*the value returned will be 2 as local version
 of the variable is present*/

//return value from function and assign
function plusThree(num) {
  return num + 3;
}
var answer = plusThree(5);

//add and remove in array function
function nextInLine(arr, item) {
  arr.push(item);
  var removed = arr.shift();
  return removed;
}
var sampleArray = [1, 2, 3, 4, 5];
nextInLine(sampleArray, 6); //or nextInLine([1, 2, 3, 4, 5], 6);
console.log(sampleArray);

/*A common use of JSON is to exchange data to/from a web server.
When sending data to a web server, the data has to be a string.
Convert a JavaScript object into a string with JSON.stringify(). */
const obj = { name: "John", age: 30, city: "New York" };
const myJSON = JSON.stringify(obj);
console.log(myJSON);

//if else in JS with boolean values
function test(myCondition) {
  if (myCondition) {
    return "It was true";
  }
  return "It was false";
}
test(true);
test(false);

/*equality operator
eg.
  3 == 3
  3 == "3"
  3 == '3'
*/
function equalityTest(myVal) {
  if (myVal == 10) {
    return "Equal";
  }
  return "Not Equal";
}

/*strictly equality operator
eg.
  3 === 3
  3 === "3" this will be false
*/
function strictEqualityTest(myVal) {
  if (myVal === 10) {
    return "Equal";
  }
  return "Not Equal";
}

/*inequality operator
eg.
  1 !=  2
  1 != "1"
  1 != '1'
  1 != true
  0 != false

  In order, these expressions would evaluate to 
  true, false, false, false, and false.
*/
function testNotEqual(val) {
  if (val != 10) {
    return "Not Equal";
  }
  return "Equal";
}
testNotEqual(10);

/*
greater than operator >
greater than equal to operator >=
less than operator <
less than equal to operator <=
 */

/*
Logical operators
    AND operator
*/
function andTest(num) {
  if (num > 5 && num < 10) {
    return "Yes";
  }
  return "No";
}

/*
    OR operator
 */
function orTest(num) {
  if (num > 5 && num < 10) {
    return "Yes";
  }
  return "No";
}

//else if statements
if (num > 15) {
  return "Bigger than 15";
} else if (num < 5) {
  return "Smaller than 5";
} else {
  return "Between 5 and 15";
}

/*
    Your function will be passed par and strokes arguments. 
    Return the correct string according to this table which lists the strokes in order of priority; top (highest) to bottom (lowest):

Strokes	Return
1	"Hole-in-one!"
<= par - 2	"Eagle"
par - 1	"Birdie"
par	"Par"
par + 1	"Bogey"
par + 2	"Double Bogey"
>= par + 3	"Go Home!"
par and strokes will always be numeric and positive. We have added an array of all the names for your convenience.
*/
function golfScore(par, strokes) {
  var names = [
    "Hole-in-one!",
    "Eagle",
    "Birdie",
    "Par",
    "Bogey",
    "Double Bogey",
    "Go Home!",
  ];

  if (strokes == 1) {
    return names[0];
  } else if (strokes <= par - 2) {
    return names[1];
  } else if (strokes == par - 1) {
    return names[2];
  } else if (strokes == par) {
    return names[3];
  } else if (strokes == par + 1) {
    return names[4];
  } else if (strokes == par + 2) {
    return names[5];
  } else {
    return names[6];
  }
}
golfScore(5, 6);

//Switch statement
switch (lowercaseLetter) {
  case "a":
    console.log("A");
    break;
  case "b":
    console.log("B");
    break;
  default:
    //default here is optional
    defaultStatement;
    break;
}

//return early pattern for functions
/**
 * Modify the function abTest so that if a or b are
 * less than 0 the function will immediately exit
 * with a value of undefined.
 */
function abTest(a, b) {
  if (a < 0 || b < 0) {
    return undefined; //undefined is keyword
  }
  return Math.round(Math.pow(Math.sqrt(a) + Math.sqrt(b), 2));
}
abTest(2, 2);

//counting cards
let count = 0;

function cc(card) {
  switch (card) {
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
      count++;
      break;
    case 10:
    case "J":
    case "Q":
    case "K":
    case "A":
      count--;
      break;
  }
  if (count > 0) {
    return count + " Bet";
  } else {
    return count + " Hold";
  }
}
console.log(cc(3));
console.log(cc(7));
console.log(cc(2));
console.log(cc("K"));
console.log(cc("A"));

//JS objects
var exampleObject = {
  myname: "xyz",
  age: 21,
  6: "test",
  model: "focus",
};

//accessing object properties
var testObj = {
  hat: "ballcap",
  shirt: "jersey",
  shoe: "cleats",
};

var testObj1val = testObj.hat; //using dot notation
console.log(testObj1val);

var testObj2val = testObj["shirt"]; //using bracket notation
console.log(testObj2val);

var t = "shoe";
var testObj3val = testObj["shoe"]; //using variable
console.log(testObj3val);

testObj.hat = "nike"; //updating object properties
testObj["shirt"] = "adidas";

testObj.pant = "haunt"; //adding new object properties
testObj["belt"] = "dollar";

delete testObj.pant; //delete properties from object

//using object for lookups "same like switch case"
function phoneticLookup(val) {
  var result = "";
  var lookup = {
    alpha: "Adams",
    bravo: "Boston",
    charlie: "Chicago",
    delta: "Denver",
    echo: "Easy",
    foxtrot: "Frank",
  };
  result = lookup[val];
  return result;
}
phoneticLookup(charlie);

//testing objects for properties
var myObj = {
  top: "hat",
  bottom: "pants",
};
myObj.hasOwnProperty("top"); //returns true
myObj.hasOwnProperty("middle"); //returns false

//manipulating complex objects
var myMusic = [
  {
    artist: "Billy Joel",
    title: "Piano Man",
    release_year: 1973,
    formats: ["CD", "6T", "LP"],
    gold: true,
  },
];

//accessing nested objects
var ourStorage = {
  desk: {
    drawer: "stapler",
  },
  cabinet: {
    "top drawer": {
      folder1: "a file",
      folder2: "secrets",
    },
    "bottom drawer": "soda",
  },
};
ourStorage.cabinet["top drawer"].folder2;
ourStorage.desk.drawer;

//accessing nested arrays
var ourPets = [
  {
    animalType: "cat",
    names: ["Meowzer", "Fluffy", "Kit-Cat"],
  },
  {
    animalType: "dog",
    names: ["Spot", "Bowser", "Frankie"],
  },
];
ourPets[0].names[1];
ourPets[1].names[0];

//Record Collection
var recordCollection = {
  2548: {
    albumTitle: "Slippery When Wet",
    artist: "Bon Jovi",
    tracks: ["Let It Rock", "You Give Love a Bad Name"],
  },
  2468: {
    albumTitle: "1999",
    artist: "Prince",
    tracks: ["1999", "Little Red Corvette"],
  },
  1245: {
    artist: "Robert Palmer",
    tracks: [],
  },
  5439: {
    albumTitle: "ABBA Gold",
  },
};

function updateRecords(records, id, prop, value) {
  if (prop !== "tracks" && value !== "") {
    records[id][prop] = value;
  } else if (
    prop === "tracks" &&
    records[id].hasOwnProperty("tracks") === false
  ) {
    records[id][prop] = [value];
  } else if (prop === "tracks" && value !== "") {
    records[id][prop].push(value);
  } else if (value === "") {
    delete records[id][prop];
  }
  return records;
}
updateRecords(recordCollection, 5439, "artist", "ABBA");

//while loop
var ourArray = [];
var i = 0;
while (i < 5) {
  ourArray.push(i);
  i++;
}
console.log(ourArray);

//for loop
var ourArray = [];
for (var i = 5; i < 10; i++) {
  ourArray.push(i);
}
console.log(ourArray);

//iterate array with a for loop
var arr = [10, 9, 8, 7, 6];
for (var i = 0; i < arr.length; i++) {
  console.log(arr[i]);
}

//nested for loop
var arr = [
  [1, 2],
  [3, 4],
  [5, 6],
];
for (var i = 0; i < arr.length; i++) {
  for (var j = 0; j < arr[i].length; j++) {
    console.log(arr[i][j]);
  }
}

//do while loop
var ourArray = [];
var i = 0;
do {
  ourArray.push(i);
  i++;
} while (i < 5);

//replace loop using recursion
function sum(arr, n) {
  /*
  var a = 0;
  for(var i = 0; i < n; i++){
    a += arr[i];
  }
  return a;
   */
  if (n <= 0) {
    return 0;
  } else {
    return sum(arr, n - 1) + arr[n - 1];
  }
}
console.log(sum([1, 2, 3, 4, 5], 2));

//Profile Lookup
var contacts = [
  {
    firstName: "Akira",
    lastName: "Laine",
    number: "0543236543",
    likes: ["Pizza", "Coding", "Brownie Points"],
  },
  {
    firstName: "Harry",
    lastName: "Potter",
    number: "0994372684",
    likes: ["Hogwarts", "Magic", "Hagrid"],
  },
  {
    firstName: "Sherlock",
    lastName: "Holmes",
    number: "0487345643",
    likes: ["Intriguing Cases", "Violin"],
  },
  {
    firstName: "Kristian",
    lastName: "Vos",
    number: "unknown",
    likes: ["JavaScript", "Gaming", "Foxes"],
  },
];

function lookUpProfile(name, prop) {
  for (var i = 0; i < contacts.length; i++) {
    if (contacts[i].firstName === name) {
      if (contacts[i].hasOwnProperty(prop)) {
        return contacts[i][prop];
      } else {
        return "No such property";
      }
    }
  }
  return "No such contact";
}
lookUpProfile("Akia", "likes");

//alternate code for above eg
function lookUpProfile(name, prop) {
  for (let i = 0; i < contacts.length; i++) {
    if (contacts[i].firstName === name) {
      if (prop in contacts[i]) {
        return contacts[i][prop];
      } else {
        return "No such property";
      }
    }
  }
  return "No such contact";
}

//Generate Random fraction with javascript
//Math.random() return betwn 0 to 1
//Math.random() can return 0(inclusive) but never
//return a 1(exclusive)
console.log(Math.random());

//Math.floor() gives nearest whole number
//here multiply by 20 so number will be betn 0 & 20
//but not 20 as 1 is never returned
console.log(Math.floor(Math.random() * 20));

//Generate Random Whole Numbers within a Range
function randomRange(myMin, myMax) {
  return Math.floor(Math.random() * (myMax - myMin + 1)) + myMin;
}
let x = randomRange(20, 40);
console.log(x);

//parseInt() returns integer
function convertToInteger(str) {
  return parseInt(str);
}

/*Use the parseInt Function with a Radix
 *parseInt(string, radix) here radix is base
 *radix tells us the type of input number
 *radix can be from 2 to 32
 *base eg. 2 for binary
 */
function convertToInteger(str) {
  return parseInt(str, 2);
}
convertToInteger("10011");

//Conditional (Ternary) operator
/**
 * The syntax is a ? b : c, where a is the condition,
 *  b is the code to run when the condition returns
 *  true, and c is the code to run when the
 *  condition returns false.
 */
function checkEqual(p, q) {
  return p == q ? "Equal" : "Not Equal";
}
checkEqual(1, 2);

//Multiple Conditional (Ternary) Operator
function checkSign(num) {
  return num < 0 ? "negative" : num > 0 ? "positive" : "zero";
}
checkSign(10);

//Use Recursion to Create a Countdown
//eg.
function countup(n) {
  if (n < 1) {
    return [];
  } else {
    const countArray = countup(n - 1);
    countArray.push(n);
    return countArray;
  }
}
console.log(countup(5));
//main
function countdown(n) {
  if (n < 1) {
    return [];
  } else {
    const countArray = countdown(n - 1);
    countArray.unshift(n);
    return countArray;
  }
}
//range of Numbers
function rangeOfNumbers(startNum, endNum) {
  if (endNum < startNum) {
    return [];
  } else {
    const countArray = rangeOfNumbers(startNum, endNum - 1);
    countArray.push(endNum);
    return countArray;
  }
}
