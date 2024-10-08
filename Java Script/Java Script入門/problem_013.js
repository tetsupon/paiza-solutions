// 数の表示とサイコロ(演習１)
process.stdin.resume();
process.stdin.setEncoding('utf8');
var number = parseInt(Math.random() * 6) + 1;
console.log("サイコロの目は"　+ number + "です");  //number変数に6の中から1つ（*６）、1から(+1)
