<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>確認画面</title>
</head>
<body>
  <h2>入力情報を確認して登録ボタンを押してください</h2>
  氏名：<strong><%= request.getAttribute("name") %></strong></br>
  パスワード：<strong><%= request.getAttribute("pass") %>></strong></br>
  年齢：<strong><%= request.getAttribute("age") %>></strong></br>
  開発経験：<strong><%= request.getAttribute("langs") %>></strong></br>
  住所：<strong><%= request.getAttribute("address") %>></strong></br>
  ご意見・お問い合わせ：<br/><strong><%= request.getAttribute("msg") %>></strong>
  <input type="submit" value="登録" />
  <input type="submit" value="戻る" /><br/><br/>
  （このフォームはフォワード先のJSPで出力しています）
</body>
</html>