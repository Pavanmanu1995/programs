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
							$(element).closest('.form-group')
									.removeClass('has-error');
						}

					});

					$.validator.addMethod('noduplication',function(value,element){
					return this.optional(element) || $('#source').val() != $('#destination').val();
					},'source and destination can not be same'
					)
				
					$('#myForm')
							.validate(
									{

										rules : {
											source : {
												required : true
											},
											destination : {
												required : true,
												noduplication:true
											}
											

										},
										

									});
				});