/**
 * 
 */

function validate() {

	var name = $("#name").val();
	if (name == "") {
		$("#name").parent().addClass("required");
		console.log("null value");
		return false;
	}
	$("#name").parent().removeClass("required");

	var rollno = $("#rollno").val();
	if (rollno == "" || !$.isNumeric(rollno)) {
		$("#rollno").parent().addClass("required");
		console.log("null value or not a number");
		return false;
	}
	$("#rollno").parent().removeClass("required");

	var cgpa = $("#cgpa").val();
	if (cgpa == "" || !$.isNumeric(cgpa)) {
		$("#cgpa").parent().addClass("required");
		console.log("null value or not a number ");
		return false;
	}
	$("#cgpa").parent().removeClass("required");

	var location = $("#location").val();
	if (location == "") {
		$("#location").parent().addClass("required");
		console.log("null value");
		return false;
	}
	$("#location").parent().removeClass("required");

	return true;
}