<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Dashboard</title>
		<link rel="stylesheet" type="text/css" href="css/dashboard-style.css">
	</head>
    
    <header class="topbar">
        <ul>
          	<li><a  href="index.jsp">Home</a></li>
            <li><a href="add.jsp" >Add</a></li>
            <li><a class="active href="dashboard.jsp">Dashboard</a></li>
        </ul>
    </header>
<br>
    
    <body class="body">
        <form action="search" method="get" class="inputs">
          <table class="input"> 
              <tr>
            <td> <input 
                    type="text" class="search_field" name="search" placeholder="Search field"/>
                  </td>
             <td> <input type="submit"
                    class="search_button"
                    name="search_button" value="Search"/>
                 </td>
              </tr>
            </table>
        </form>
        

        
<table class="tableOfMeals" >
  <tr>
    <th>Id</th>
    <th>Title</th>
    <th>Type</th>
    <th>Price</th>
    <th>Description</th>
    <th>Available</th>
    <th>Owner</th>
    <th>Time</th>
    <th></th>
  </tr>
 

  <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
 
      <td class="columnForDelete">
      	<form action="delete" method="get">
          <input type="submit" class="delete" value="Delete" />
        </form>
      </td>
  </tr>
  
</table> 
        
</body>   
</html>