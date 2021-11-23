let quit = "qu";
let noquit = "qt";
let quRegex = /q(?=u)/;
let qRegex = /q(?!u)/;
quit.match(quRegex);
noquit.match(qRegex);