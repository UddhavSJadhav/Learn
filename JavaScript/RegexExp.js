//Using the Test Method
let myString = "Hello, World!";
let myRegex = /Hello/; //to find this word exists && /hello/ will return false
let result = myRegex.test(myString); //sets true

//Match a Literal String with Different Possibilities
let petString = "James has a pet cat.";
let petRegex = /dog|cat|bird|fish/; // | is for OR operator
let result = petRegex.test(petString);

//Ignore Case While Matching
let myString = "freeCodeCamp";
let fccRegex = /freecodecamp/i; // i is used to ignore case sensi.
let result = fccRegex.test(myString);

// Extract Matches
let extractStr = "Extract the word 'coding' from this string.";
let codingRegex = /coding/;
let result = extractStr.match(codingRegex); //set result  = coding or the matching regex

//Find More Than the First Match
//To search or extract a pattern more than once, you can use the g flag. || to get multiple matches in form of array
let twinkleStar = "Twinkle, twinkle, little star";
let starRegex = /Twinkle/gi;
let result = twinkleStar.match(starRegex);

//Match Anything with Wildcard Period
let exampleStr = "Let's have fun with regular expressions!";
let unRegex = /.un/; // it will search for worrk with *un , here 'fun'
let result = unRegex.test(exampleStr);

//Match Single Character with Multiple Possibilities
let quoteSample =
  "Beware of bugs in the above code; I have only proved it correct, not tried it.";
let vowelRegex = /[aeiou]/gi;
let result = quoteSample.match(vowelRegex);

//Match Letters of the Alphabet
let quoteSample = "The quick brown fox jumps over the lazy dog.";
let alphabetRegex = /[a-z]/gi; //a-z means a to z.
let result = quoteSample.match(alphabetRegex);

//Match Numbers and Letters of the Alphabet
let quoteSample = "Blueberry 3.141592653s are delicious.";
let myRegex = /[h-s2-6]/gi; //for h to s and number 2 to 6
let result = quoteSample.match(myRegex);

//Match Single Characters Not Specified
//Create a single regex that matches all characters that are not a number or a vowel.
let quoteSample = "3 blind mice.";
let myRegex = /[^aeiou0-9]/gi;
let result = quoteSample.match(myRegex);

//Match Characters that Occur One or More Times
let difficultSpelling = "Mississippi";
let myRegex = /s+/g; // will return [ss,ss] as s are in row
let result = difficultSpelling.match(myRegex);

//Match Characters that Occur Zero or More Times
let soccerWord = "gooooooooal!";
let gPhrase = "gut feeling";
let oPhrase = "over the moon";
let goRegex = /go*/;
soccerWord.match(goRegex);
gPhrase.match(goRegex);
oPhrase.match(goRegex);
// In order, the three match calls would return the values ["goooooooo"], ["g"], and null

//Find Characters with Lazy Matching
let text = "<h1>Winter is coming</h1>";
let myRegex = /<.*?>/; // to match <h1> tag only
let result = text.match(myRegex);
console.log(result);

/**
 * /[^aeiou]/ here ^ is used as negative means letter other than aeiou
 * /^aeiou/ here ^ is used as search from start of the statement
 */
let rickyAndCal = "Cal and Ricky both like racing.";
let calRegex = /^Cal/;
let result = calRegex.test(rickyAndCal);

//Similarly $ is use to find the combination is at end of the statement or not
let caboose = "The last car on a train is the caboose";
let lastRegex = /caboose$/;
let result = lastRegex.test(caboose);

//in regex \w  ==  [A-Za-z0-9_]
let quoteSample = "The five boxing wizards jump quickly.";
let alphabetRegexV2 = /\w/g;
let result = quoteSample.match(alphabetRegexV2).length;
// \W acts opposite to \w. {\W  ===  [^a-zA-z0-9_]}

//  \d is to find digits
let movieName = "2001: A Space Odyssey";
let numRegex = /\d/g;
let result = movieName.match(numRegex).length;
console.log(result);
// \D is opposite to \d

/**
 * Usernames can only use alpha-numeric characters.
 * The only numbers in the username have to be at the end.
 * There can be zero or more of them at the end. Username cannot start with the number.
 * Username letters can be lowercase and uppercase.
 * Usernames have to be at least two characters long.
 * A two-character username can only use alphabet letters as characters.
 */
let username = "JackOfAllTrades";
let userCheck = /^[a-z][a-z]+\d*$|^[a-z]\d\d+$/i;
let result = userCheck.test(username);

/**
 *  \s means whitespace
 *  \S means no sapces
 */
let sample = "Whitespace is important in separating words";
let countWhiteSpace = /\s/g; //to find mutiple spaces in statement
let result = sample.match(countWhiteSpace);

//Specify Upper and Lower Number of Matches
// Change the regex ohRegex to match the entire phrase Oh no only when it has 3 to 6 letter h's.
let ohStr = "Ohhh no";
let ohRegex = /Oh{3,6}\sno/;
let result = ohRegex.test(ohStr);

//Specify Only the Lower Number of Matches
//Change the regex haRegex to match the word Hazzah only when it has four or more letter z's.
let haStr = "Hazzzzah";
let haRegex = /Haz{4,}ah/;
let result = haRegex.test(haStr);

//Change the regex timRegex to match the word Timber only when it has four letter m's.
let timStr = "Timmmmber";
let timRegex = /Tim{4}ber/;
let result = timRegex.test(timStr);

//Check for All or None
//You can specify the possible existence of an element with a question mark, ?.
//Change the regex favRegex to match both the American English (favorite) and the British English (favourite) version of the word.
let favWord = "favorite";
let favRegex = /favou?rite/;
let result = favRegex.test(favWord);

//Positive and Negative Lookahead
let quit = "qu";
let noquit = "qt";
let quRegex = /q(?=u)/;
let qRegex = /q(?!u)/;
quit.match(quRegex);
noquit.match(qRegex);
// Both of these match calls would return ["q"].
//Use lookaheads in the pwRegex to match passwords that are greater than 5 characters long, and have two consecutive digits.
let sampleWord = "astronaut";
let pwRegex = /(?=\w{5,})(?=\D+\d\d)/;
let result = pwRegex.test(sampleWord);

// Check For Mixed Grouping of Characters
// Fix the regex so that it checks for the names of Franklin Roosevelt or Eleanor Roosevelt
// in a case sensitive manner and it should make concessions for middle names.
// Then fix the code so that the regex that you have created is checked against myString and
// either true or false is returned depending on whether the regex matches.
let myString = "Eleanor Roosevelt";
let myRegex = /(Franklin|Eleanor).*Roosevelt/; //.* is for middle name
let result = myRegex.test(myString);

//Use capture groups in reRegex to match a string that consists of only the same number
// repeated exactly three times separated by single spaces.
let repeatNum = "42 42 42";
let reRegex = /^(\d+)\s\1\s\1$/;
let result = reRegex.test(repeatNum);
console.log(result);

//Use Capture Groups to Search and Replace .replace()
//You can also access capture groups in the replacement string with dollar signs ($).
"Code Camp".replace(/(\w+)\s(\w+)/, "$2 $1");
// The replace call would return the string Camp Code.
/**Write a regex fixRegex using three capture groups that will search for each word in the string one two three.
 * Then update the replaceText variable to replace one two three with the string three two one and assign the result
 * to the result variable. Make sure you are utilizing capture groups in the replacement string using the dollar sign
 * ($) syntax. */
let str = "one two three";
let fixRegex = /(\w+)\s(\w+)\s(\w+)/;
let replaceText = "$3 $2 $1";
let result = str.replace(fixRegex, replaceText);

//Remove Whitespace from Start and End
let hello = "   Hello, World!  ";
let wsRegex = /^(\s+)|(\s+)$/g;
let result = hello.replace(wsRegex, "");
