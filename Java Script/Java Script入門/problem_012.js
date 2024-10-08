// 数の表示とサイコロ
process.stdin.resume();
process.stdin.setEncoding('utf8');
var randnum = parseInt(Math.random() * 10) + 1;  //parseInt関数；文字列の整数を数値型の整数に変換するJavaScriptの組み込み関数
//console.log(randnum);
//var number = 100;
console.log("スライムが" + randnum + "匹あらわれた");