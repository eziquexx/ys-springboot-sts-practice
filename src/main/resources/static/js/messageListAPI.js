/**
 * 
 */


function messageListAPI() {
	// loading, error, messageList ele 가져오기
	const loading = document.getElementById("loading");
	const error = document.getElementById("error");
	const container = document.getElementById("container");
	const messageList = document.getElementById("list");
	
	// loading, error, messageList style display
	loading.style.display = "block";
	error.style.display = "none";
	container.style.display = "none";
	messageList.innerHTML = "";
	
	// fetch, then, catch
	fetch('/messages/api')
	.then(response => {
		if (!response.ok) {
			throw new Error ('Network response was not ok. 네트워크 응답 없음');
		}
		return response.json();
	})
	.then(messages => {
		loading.style.display = "none";
		container.style.display = "block";
		messages.forEach(msg => {
			const li = document.createElement("li");
			
			li.innerHTML = `<a href="/messages/${msg.id}">${msg.id} - ${msg.message}</a>`;
			messageList.appendChild(li);
		});
	})
	.catch(error => {
		console.error("Error: ", error);
		loading.style.display = "none";
		container.style.display = "none";
		error.style.display = "block";
	})
}


window.addEventListener("DOMContentLoaded", messageListAPI);