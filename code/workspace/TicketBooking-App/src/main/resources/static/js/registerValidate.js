$(document)
		.ready(
				function() {

					$.validator.setDefaults({
						errorClass : 'help-block',
						highlight : function(element) {

							$(element).closest('.form-group').addClass(
									'has-error');
						},
						unhighlight : function(element) {
							$(element).closest('.form-group').removeClass(
									'has-error');
						}

					});
					$.validator
					.addMethod(
							'pattern',
							function(value, element) {
								return this.optional(element)
										||  /[A-Z]+[a-z]/i.test(value);
										

							},
							'user name must start with capitel letter and user name should content only character')

					$.validator
							.addMethod(
									'storngPassword',
									function(value, element) {
										return this.optional(element)
												|| value.length >= 6
												&& /\d/.test(value)
												&& /[a-z]+[A-Z]/i.test(value);

									},
									'your password must be at least 6 characters long and contain atleast one number and one char one capitel char')
					$.validator.addMethod('patternMobile', function(value,
							element) {
						return this.optional(element) || value.length == 10
								&& /[0-9]/i.test(value);
					}, 'mobile number should contain 10 digits')

					$('#regform').validate({

						rules : {
							userName : {
								required : true,
								pattern:true,
								minlength : 4
							},
							email : {
								required : true,
								email : true
							},
							password : {
								storngPassword : true,
								required : true
							},
							password2 : {
								required : true,
								equalTo : "#password"
							},
							mobile : {
								patternMobile : true,
								required : true
							},
							date : {
								required : true
							}

						},
						message : {
							email : {
								required : 'please enter an email address',
								email : 'please enter a valid email address'
							},
							name : {
								minlength : 'name length should be 4'

							}
						}

					});
				});