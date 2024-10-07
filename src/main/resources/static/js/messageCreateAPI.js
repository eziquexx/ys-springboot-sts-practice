/**
 * 
 */

document.getElementById("messageForm").addEventListener("submit", function(e) {
	e.preventDefault();
	
	// message 담을 객체 생성
	const message = {
		message : document.getElementById("msg").value,
	}
	
	// fetch, then, error
	fetch("/messages", {
		method: "POST",
		headers: {
			"Content-type": "application/json",
		},
		body: JSON.stringify(message)
	})
	.then(response => {
		if (response.ok) {
			alert("메세지 등록 성공");
			document.getElementById("messageForm").reset();
		} else {
			alert("메세지 등록 실패");
		}
	})
	.catch(error => {
		console.error("Error: ", error);
		alert("오류발생");
	})
})