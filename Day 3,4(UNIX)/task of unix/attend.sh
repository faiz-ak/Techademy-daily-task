students=("Faizan" "Kishor" "Sravya" "Adya" "Akash" "Famiya" "Gajula" "John" "Kanuma")

validate_status(){
  case "$1" in
    P) echo "Present" ;;
    A) echo "Absent" ;;
    L) echo "Late Attendee" ;;
    *) echo "Invalid" ;;
  esac
}

declare -A attendance_records

for stdname in "${students[@]}"; do
  while true; do
    echo -n "Enter attendance status for $stdname (P/A/L): "
    read stdstat
    validated_status=$(validate_status "$stdstat")
    if [[ "$validated_status" == "Invalid" ]]; then
      echo "Invalid status entered. Please enter P, A, or L."
    else
      attendance_records["$stdname"]="$validated_status"
      break
    fi
  done
done

absent_students=()
present_students=()
late_students=()

for name in "${students[@]}"; do
  case "${attendance_records[$name]}" in
    "Absent") absent_students+=("$name") ;;
    "Present") present_students+=("$name") ;;
    "Late Attendee") late_students+=("$name") ;;
  esac
done

echo -e "\nAttendance Summary:"

if [ ${#absent_students[@]} -gt 0 ]; then
  echo "Absent: ${absent_students[@]}"
   
  fi

if [ ${#present_students[@]} -gt 0 ]; then
  echo "Present: ${present_students[@]}"
fi

if [ ${#late_students[@]} -gt 0 ]; then
  echo "Late Attendee: ${late_students[@]}"
fi
