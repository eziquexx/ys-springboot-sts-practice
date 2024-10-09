/**
 * 
 */

function deleteItem(id) {
	if(confirm("정말 삭제하시겠습니까?")) {
		//삭제 요청 url
		const url = `/delete/${id}`;
		
		//form ele 생성
		const form = document.createElement("form");
		form.method = "post";
		form.action = url;
		
		document.body.appendChild(form);
		form.submit();
	}
}