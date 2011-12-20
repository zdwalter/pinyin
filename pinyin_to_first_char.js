
var stdin = process.openStdin();
var data = '';
stdin.on('data', function(chunk) {
	data += chunk.toString().split("\n").map(
	function(line) { 
	    return line.split(' ').map( function(word) {
		return word[0];
	    }).join('');
	} ).join('');
});

stdin.on('end', function() {
    console.log(data);
});

