#!/bin/bash
cat gbk_to_unicode.js unicode_to_pinyin.js gbk_to_pinyin_temp.js > gbk_to_pinyin_gen.js
node gbk_to_pinyin_gen.js > gbk_to_pinyin.js

