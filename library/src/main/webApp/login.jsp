<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<title>Login Page</title>

</head>
<body>
	<div class="card">
		<div class="card-header">Library Management</div>
	</div>
	
	<!-- form -->
	<fieldset class="form-group border p-3">
                <legend  class="w-auto px-2">Library Login</legend><hr>
	 <form action="#" th:action="@{/login}" th:object="${user}" method="post" id="enrollment-form" onsubmit="handleSumbit(event)">
  <div class="row mb-3">
    <label for="userId" class="col-sm-2 col-form-label">UserName</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="username" required/>
    </div>
  </div>
  <div class="row mb-3">
    <label for="Password" class="col-sm-2 col-form-label">Password</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" name="password" required/>
    </div>
  </div>
  
  <button type="submit" class="btn btn-primary">Sign in</button>
</form>
 </fieldset>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" >

    </script>
</body>
</html>