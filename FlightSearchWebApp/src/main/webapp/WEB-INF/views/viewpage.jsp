<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ include file="/WEB-INF/views/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Available Flight</title>
</head>
<body>
	<div style="color: red" align="center">${errormessage}</div>

	<div class="searchparameters">
		<h3>Fill in the Required Details to Search Flights Available:</h3>
		<form:form action="search" method="post"
			commandName="flightsearchparameter">
			<table>
				<tr>
					<td>Departure Location</td>
					<td><form:input path="departureLocation" /></td>
					<td><form:errors path="departureLocation" cssClass="error"
							cssStyle="color: #ff0000;" /></td>
				</tr>
				<tr>
					<td>Arrival Location</td>
					<td><form:input path="arrivalLocation" /></td>
					<td><form:errors path="arrivalLocation" cssClass="error"
							cssStyle="color: #ff0000;" /></td>
				</tr>
				<tr>
					<td>Flight Date</td>
					<td><form:input type="date" path="flightDate" /></td>
					<td><form:errors path="flightDate" cssClass="error"
							cssStyle="color: #ff0000;" /></td>
				</tr>
				<tr>
					<td><label for="class">Flight Class</label></td>
					<td><form:select path="flightClass">
							<option value="E" selected>Economy</option>
							<option value="B">Business</option>
							<option value="EB">EB</option>
						</form:select></td>
				</tr>
				<tr>
					<td><label for="preference">Sort By:</label></td>
					<td><form:select path="OutputPreference">
							<option value="Fare" selected>Fare</option>
							<option value="FareandDuration">Fare and Duration</option>
						</form:select></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Search" />
						&nbsp;&nbsp; <input type="reset" value="Reset"></td>
				</tr>
			</table>

		</form:form>
	</div>
	<br>
	<div class="Flightdetails">
		<h4>Available Flights:</h4>
		<table border="1" align="center">
			<thead>
				<tr>
					<th>Flight Number</th>
					<th>Time</th>
					<th>Departure</th>
					<th>Arrival</th>
					<th>Duration</th>
					<th>Fare</th>
					<th>Class</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${List}" var="flight">
					<tr>
						<td><c:out value="${flight.getFlightNumber()}" /></td>
						<td><c:out value="${flight.getFlightTime()}" /></td>
						<td><c:out value="${flight.getDepartureLocation()}" /></td>
						<td><c:out value="${flight.getArrivalLocation() }" /></td>
						<td><c:out value="${flight.getFlightDuration() }" /></td>
						<td><c:out value="${flight.getFare()}" /></td>
						<td><c:out value="${flight.getFclass() }" /></td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
	</div>

</body>
</html>



