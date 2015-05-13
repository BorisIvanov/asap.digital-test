<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Person page</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="theme/jquery-ui-1.10.0.custom.css">
    <link rel="stylesheet" href="theme/jquery.ui.1.10.0.ie.css">
</head>
<body>
<div class="container">
    <div class="row">
        <form class="form-horizontal">
            <div class="form-group">
                <label for="firstName" class="col-sm-2 control-label">First Name</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="firstName" placeholder="First Name">
                </div>
            </div>
            <div class="form-group">
                <label for="middleName" class="col-sm-2 control-label">Middle Name</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="middleName" placeholder="Middle Name">
                </div>
            </div>
            <div class="form-group">
                <label for="lastName" class="col-sm-2 control-label">Last Name</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="lastName" placeholder="Last Name">
                </div>
            </div>
            <div class="form-group">
                <label for="birthday" class="col-sm-2 control-label">Birthday</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="birthday" placeholder="Birthday">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-4">
                    <button type="submit" class="btn btn-default">Save</button>
                </div>
            </div>
        </form>
    </div>
</div>
<script src="http://yastatic.net/jquery/2.1.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<script>
    $(function() {
        $( "#birthday" ).datepicker();
    });
</script>
</body>
</html>