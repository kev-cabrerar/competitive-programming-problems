for file in *.java; do
  if [ -e "$file" ]; then
    newname=`echo "$file" | sed 's/Uri\?//'`
    mv "$file" "$newname"
  fi
done