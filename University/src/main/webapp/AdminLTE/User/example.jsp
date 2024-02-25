<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="pagecreate.pageUser" %>
<%@ page import="pagecreate.pageUserDAO" %>
<%@ page import="java.util.ArrayList" %>

<%
int userId = Integer.parseInt(request.getParameter("id"));
pageUser user = new pageUserDAO().getUserById(userId);
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>University Home Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: #FFFFFF;
            position:sticky;
            top:0;
            padding: 10px;
            text-align: center;
            display: flex;
            justify-content: space-around;
            align-items: center;
        }

        nav {
            
            text-align: center;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }

        nav a {
            color: #fff;
            text-decoration: none;
            margin: 0 15px;
        }

        nav img {
            max-height: 50px;
            margin-right: 15px;
        }

        section {
       		background-color:white;
            padding: 20px;
            text-align: center;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }

        section img {
            max-width: 100%;
            height: 100vh;
            border-radius: 10px;
            margin: 20px 0;
        }

        footer {
            background-color: #333;
            color: #fff;
            padding: 10px;
            text-align: center;
            width: 100%;
        }
    </style>
</head>
<body>
    <header>
        <nav>
             <img src="../../img/<%= user.getImage() %>" alt="University Logo">
        </nav>
        <div>
           
            <h1><%= user.getUniname() %><%= user.getLocation() %></h1>
        </div>
    </header>

    <section>
        <img src="../../img/<%= user.getImage() %>" alt="University Logo">
        <p>(စျ)	တက္ကသိုလ်ခွဲဝေနေရာချထားရေးအဖွဲ့မှ အခါအား‌လျော်စွာ သတ်မှတ်ချက်နှင့်အညီ ခွဲဝေသတ်မှတ်ပေးသည့် ဆေးတက္ကသိုလ်တွင် သင်တန်းပြီးဆုံးသည်အထိ တက်ရောက်နိုင်သူဖြစ်ရမည်။
(ည)	ဆေးတက္ကသိုလ်သို့ တက်ရောက်ခွင့်ရရှိသူများသည် သင်တန်းကိုပြီးဆုံးအောင် တက်ရောက်ရမည်။
(ဠ)	ဆေးတက္ကသိုလ်များသို့ ဝင်ခွင့်ရရှိပြီး ကျောင်းလခ(၁)လလျှင် (၈၀၀)ကျပ်ဖြင့် တက်ရောက်လိုသူများသည် သင်ကြားရေးစာသင်ဆောင် အဆောက်အဦီးများ (Infrastructure) ပရိဘောဂ၊ သင်ထောက်ကူပစ္စည်းများ၊ စာကြည့်တိုက်နှင့် ဓာတ်ခွဲခန်းသုံးပစ္စည်းများ၊ သင်ကြားရေး ဆရာ၊ ဆရာမများနှင့် ဝန်ထမ်းများ၏ လစာများကို နိုင်ငံတော်ဘဏ္ဍာမှ ကျခံသုံးစွဲရသဖြင့်-
(၁)	ဆေးပညာဘွဲ့ရရှိပြီးသည့်အချိန်မှ နိုင်ငံ့ဝန်ထမ်းအဖြစ် အနည်းဆုံး (၅)နှစ်၊ ဘွဲ့လွန်သင်တန်း တက်ရောက်အောင်မြင်ပြီးပါက နိုင်ငံ့ဝန်ထမ်းအဖြစ် အနည်းဆုံး (၅)နှစ် မပျက်မကွက် (မပျက်မကွက်) တာဝန်ထမ်းဆောင်ပါမည်ဟု ကတိခံဝန်ချက်စာချုပ် ချုပ်ဆိုကြရမည်။
(၂) 	ကတိခံဝန်ချက်စာချုပ်ပါ ကတိပြုချက်တစ်ရပ်ရပ်ကို ချိုးဖောက် ပျက်ကွက်ပါက (သို့မဟုတ်) တာဝန်ထမ်း‌ဆောင်ရန် ပျက်ကွက်ပါက လျော်ကြေးငွေ (၆၀,၀၀၀,၀၀၀ိ/-) (ကျပ်သိန်းခြောက်ရာတိတိ)ကို ပေးလျော်ရန်နှင့် သက်ဆိုင်ရာ ဉပဒေ၊ စည်းမျဉ်စည်းကမ်းများအရ အရေးယူခြင်းကိုလည်း ခံရမည် ဖြစ်ပါသည်။ ထို့အပြင် အထွေထွေဆေးကုသခွင့် လိုင်စင် (ဆမ) ထုတ်ပေးမည်မဟုတ်ပါ။
(ဌ)	ဆေးတက္ကသိုလ်များသို့ ဝင်ခွင့်ရရှိသူများအနက် ဆေးပညာဘွဲ့ရရှိပြီးနောက် နိုင်ငံ့ဝန်ထမ်းအဖြစ် တာဝန်ထမ်းဆောင်လိုခြင်းမရှိသူမျာသည် မိမိစရိတ်ဖြင့် တက်ရောက်ပညာ သင်ကြားနိုင်ပြီး သီးခြားသတ်မှတ်ထားသော တက္ကသိုလ်သင်တန်းကြေးများကို ပေးသွင်း၍ တက်ရောက်ရမည်။ (မူလ ဝင်ခွင့်ပြုဉီးရေ (၁၁၅၀)၏ (၃၀%) ထက်မပိုသော ဉီးရေကိုသာ)
(ဍ)	တက္ကသိုလ်ဝင်ခွင့်စိစစ်ရွေးချယ်ရေးအဖွဲ့မှ ထုတ်ဝေပေးသည့် တက္ကသိုလ်ဝင်ခွင့် လျှောက်လွှာ စာအိတ်ပါ လျှောက်လွှာပုံစံများဖြင့် လျှောက်ထားရမည်။
(ဎ)	တက္ကသိုလ်ဝင်ခွင့်စိစစ်ရွေးချယ်ရေးအဖွဲ့မှ သတ်မှတ်ထားသောလျှောက်လွှာလက်ခံ နောက်ဆုံးရက်ထက် ကျော်လွန်ရောက်ရှိလာသော လျှောက်လွှာများကို လက်ခံစဉ်းစားမည် မဟုတ်ပါ။
</p>
    </section>

    <footer>
        <p>&copy; 2024 <%= user.getUniname() %> All rights reserved.</p>
    </footer>
</body>
</html>
