		<%@ include file="common/header.jspf" %>
		<%@ include file="common/navigation.jspf" %>
		<div class="container">
			
			<h1>Enter Todo details</h1>
			<form:form method="post" modelAttribute="todo">
				
				<fieldset class="mb-3">
					<form:label path="description">Description</form:label>
					<form:input type="text" name="Description" 
					 path="description" required="required"/>
					<form:errors path="description" cssClass="text-warning"/>
				</fieldset>
				
				<fieldset class="mb-3">
					<form:label path="dateTarget">Date Target</form:label>
					<form:input type="text" path="dateTarget" name="dateTarget" 
					  required="required"/>
					<form:errors path="dateTarget" cssClass="text-warning"/>
				</fieldset>
				
				<form:input type="hidden" name="id" path="id"/>
				<form:input type="hidden" name="done" path="done"/>
				<input type="submit" class="btn btn-success">
				
			</form:form>
			
	    </div>
		<%@ include file="common/footer.jspf" %>
		<script type="text/javascript">
			$('#dateTarget').datepicker({
			    format: 'yyyy-mm-dd'
			});
		</script>