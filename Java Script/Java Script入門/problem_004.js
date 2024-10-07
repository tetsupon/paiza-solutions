// HTMLを表示する
process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdout.write("<h1>hello world</h1>\n");   //改行しない場合は、console.logではなくprocess.stdout.write（スタンダードアウト ライト）関数
process.stdout.write("<p>世界の皆さん、\n");      // \nは改行コードで\nで折り返すようになる
process.stdout.write("<b>こんにちは</b></P>");