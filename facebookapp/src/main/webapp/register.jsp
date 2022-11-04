<!DOCTYPE html>
<html>

<head>
    <title>facebook_mini_app - Connect your world</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./font-awesome/css/font-awesome.min.css">
    
    <link rel="stylesheet" href="./bootstrap/css/bootstrap.min.css">
    <script src="./js/jquery-2.2.4.min.js"></script>
    <script src="./bootstrap/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="./css/main.css">
</head>

<body>
<section class="container-fluid" style=" margin-top:-30px; margin-top: auto; margin-bottom: auto">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <form action="ProfileServlet" method="post" id="body-login-form">
                    <h1 style="color: #2e6da4;font-family: Helvetica;text-align: center">facebook_mini_app</h1>
                    <label><h2 style="color: #2e6da4;font-family: Helvetica;text-align: center">Create Account</h2></label>
                    <div class="reg-input" id="firs-name">
                        <input type="text" name="first-name" placeholder="First name" required>
                    </div>
                    <div class="reg-input" id="las-name">
                        <input type="text" name="last-name" placeholder="Last name" required>
                    </div>
                    <div class="reg-input" id="user-name">
                        <input type="text" name="username" placeholder="Username" required>
                    </div>
                    <div class="reg-input" id="email">
                        <input type="text" name="user-email" placeholder="Email address" required>
                    </div>
                    <div class="reg-input" id="user-password">
                        <input type="password" name="user-password" placeholder="New password" required>
                    </div>
                    <p class="help-block">
                        By clicking Create an account, you agree to our Terms and that you have read our Data Policy, including our Cookie Use.
                    </p>
                    <button type="submit" id="btn-login">Create an account</button>
                    <a href="login.jsp">Have account? login here</a>
                </form>

            </div>
        </div>
    </div>
</section>

    <script src="./js/app.js"></script>
    
    <script>
        $(function() {
            for (var i = 1; i <= 31; i++) {
                $("#days").append("<option>" + i + "</option>");    
            }
            
            for (var i = 1; i <= 12; i++) {
                $("#months").append("<option>" + i + "</option>");    
            }
            
            for (var i = 2016; i >= 1905; i--) {
                $("#years").append("<option>" + i + "</option>");    
            }
        });
    </script>
</body>

</html>
