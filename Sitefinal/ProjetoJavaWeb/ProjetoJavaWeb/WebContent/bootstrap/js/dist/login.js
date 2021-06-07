function logar(){
	var email = document.getElementById("email");
	var senha = document.getElementById("senha");

	console.log(email.value+senha.value);

	if(email.value == "admin@admin" && senha.value == "admin"){
		localStorage.setItem("acesso", true);

		window.location.href = "CadastroUsuarios.html";
	} else{
		alert("Usuario ou senha invalidos!");
	}
}