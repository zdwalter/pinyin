var start = parseInt('8140', 16);
var end = parseInt('EF4F', 16);
console.log('var gbk_to_pinyin_dict = {');
for (var i = start; i <= end; i++) {
    var pinyin = '-';
    var key = i.toString(16).toUpperCase();
    var u = gbk_to_unicode_dict[key];
    if (u) {
        var p= unicode_to_pinyin_dict[u];
        if (p)
            pinyin = p;
    }
    console.log("'"+key + "':'"+pinyin+"',");
}
console.log('};');


