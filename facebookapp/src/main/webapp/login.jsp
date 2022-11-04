<!DOCTYPE html>
<html>

<head>
    <title>facebook_mini_app - Connect your world</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="font-awesome">

    <link rel="stylesheet" href="bootstrap/bootstrap.min">
    <script src="js/jquery-2.2.4.min.js"></script>
    <script src="bootstrap/bootstrap.min.js"></script>

    <link rel="stylesheet" href="css/main.css">
</head>

<body>
<%--    <nav class="container-fluid" id="main-nav-login">--%>
<%--        <div class="container">--%>
<%--            <div class="row">--%>
<%--                <div class="col-md-6">--%>
<%--                    <a href="./news-feed.html" id="logo-large">facebook_mini_app</a>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </nav>--%>

    <section class="container-fluid" style=" margin-top:-30px; margin-top: auto; margin-bottom: auto">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <form action="LoginServlet" method="post" id="body-login-form">
                        <h1 style="color: #2e6da4;font-family: Helvetica;text-align: center">facebook_mini_app</h1>
                        <label><h2 style="color: #2e6da4;font-family: Helvetica;text-align: center">Login</h2></label>
                        <input type="text" name="user-login-name" placeholder="Enter your username" required />
                        <input type="password" name="user-login-password" placeholder="Password" required />
                        <button type="submit" id="btn-login">Login</button>
                        <a href="/">Forgotten password?</a> <br>
                        <p>Don't have an account? Register <a href="register.jsp">here</a>!</p>
<%--                        <a href="./register.html">Signup for CBOOKSOCIAL?</a>--%>
                    </form>
                </div>
            </div>
        </div>
    </section>


</body>

</html>
