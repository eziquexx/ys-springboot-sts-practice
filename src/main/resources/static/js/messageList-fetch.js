/**
 * 
 */


function messageListFetch() {
	
	const loading = document.getElementById("loading_id");
	const error = document.getElementById("error_id");
	const messageList = document.getElementById("messageList_id");
	
	loading.style.display = "block";
	error.style.display = "none";
	messageList.innerHTML = "";
	
	// api 불러오기.
	fetch("/messages/api")
	.then(response => {
		if (!response.ok) {
			throw new Error("response 실패");
		}
		return response.json();
	})
	.then(messages => {
		loading.style.display = "none";
		
		messages.forEach(msg => {
			const li = document.createElement("li");
			li.innerHTML = `<a href="/messages/${msg.id}">${msg.id} - ${msg.message}</a>`;
			
			messageList.appendChild(li);
		});
	})
	.catch(error => {
		console.error("fetch error: ", error);
		
		loading.style.display = "none";
		error.style.display = "block";
	})
}


window.addEventListener("DOMContentLoaded", messageListFetch);