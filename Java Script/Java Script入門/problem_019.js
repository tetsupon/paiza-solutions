//値段を計算する
process.stdin.resume();
process.stdin.setEncoding('utf8');
var apple_price = (parseInt(Math.random() * 3) + 1) * 100;   //リンゴの単価,リンゴの単価を100,200,300とランダムに選択((parseIntを()で囲んで最後に* 100をする)
var apple_num = parseInt(Math.random() * 10) + 1;    //リンゴを買う数,random関数に書き換える（ランダムに選択される数を〜10に）
console.log("リンゴの単価 : " + apple_price + "円" );
console.log("リンゴの個数 : " + apple_num + "個");
var total = apple_price * apple_num;       //変数(total)にapple_priceとapple_numをかけた金額を表示
console.log("合計金額 : " + total + "円");