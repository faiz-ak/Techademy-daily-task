declare -A users
users[admin]="ad1234"
users[guest]="gu1234"
users[member]="me1234"

validate_login() {
 local uname=$1
 local upass=$2

if [[ -n "${users[$uname]}" && "${users[$uname]}" == "$upass" ]]; then
echo "User Logged in Successfully"
return 0
else
return 1
fi
}

validate_condition(){
case "$1" in
"admin") echo "You are successfully logged in as Admin";;
"guest") echo "You are successfully logged in as Guest";;
"member") echo "You are successfully logged in as Member";;
*) echo "You don't have the access";;
  esac
}

for ((user=1; user<=3; user++)); do
echo "Enter your username:"
read name
echo "Enter your password:"
read pass
echo ""

if validate_login "$name" "$pass"; then
validate_condition "$name"
exit 0
else
echo "Invalid credentials.(Maximum attempt of $user is 3)"
fi
done

echo "You have done too many attempts! System sign off!!"
exit 0
