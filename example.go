package main

import (
	"fmt"
	"regexp"
)

func main() {
	re, _ := regexp.Compile(".com")
	fmt.Println(re.FindString("opsramp.com"))
	fmt.Println(re.FindString("opsramp.org"))
	fmt.Println(re.FindStringIndex("opsramp.com"))
	fmt.Println(re.FindStringIndex("opsramp.org"))
	re1, _ := regexp.Compile("n([a-z]+)ion")
	fmt.Println(re1.FindStringSubmatch("nation"))
	re2, _ := regexp.Compile("org([a-z]+)ion")
	fmt.Println(re2.FindStringSubmatch("organization"))
	re3, _ := regexp.Compile(" ")
	fmt.Println(re3.ReplaceAllString("a b c d e f", "+"))
}
