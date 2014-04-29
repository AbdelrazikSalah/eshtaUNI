function sendForm() {
	YUI().use(
			"io-base", 'node',
			function(Y) {

			
				
				
				var firstname = document.getElementById("firstname")
						.value;
				var lastname = document.getElementById("lastname")
						.value;
				var salary = document.getElementById("salary").value;

				var url = '/Reg?firstname=' + firstname + '&lastname='
						+ lastname + '&salary=' + salary;

				Y.io(url, {
					method : 'POST',
					on : {
						success : function(id, result) {
							Y.one('#wrapper').set('innerHTML', result.responseText);
							
						},
						failure : function(id, result) {
						}

					}
				});

			});
}
