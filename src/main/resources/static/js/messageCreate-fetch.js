/**
 * 
 */

const messageCreateForm = document.getElementById("messageCreateForm");

messageCreateForm.addEventListener("submit", function(e) {
	e.preventDefault();
	
	// 메세지 담을 객체 필요.
	const message = {
		message: document.getElementById("input_message").value,
	}
	
	
	// fetch
	fetch("/create", {
		method: "POST",
		headers: {
			"Content-type": "application/json",
		},
		body: JSON.stringify(message)
	})
	.then(response => {
		if(response.ok) {
			alert("message 전송 성공");
			messageCreateForm.reset();
		} else {
			alert("message 전송 실패");
		}
	})
	.catch(error => {
		console.error("Error: ", error);
		alert("에러 발생");
	})
})