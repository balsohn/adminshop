const my=React.createElement(
	'h2',
	{className:'aa',id:'bb',align:'center'},
	'게시판 목록입니다'
)

const domContainer=document.querySelector("#root");
ReactDOM.render(
	my,domContainer
);