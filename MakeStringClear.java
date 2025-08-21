class MakeStringClear{
    public static void ClearStr(String str,int index,String newStr,int count){
        if(index==str.length()-1){
            for(int i =1;i<=count;i++){
                newStr+="x";
            }
            System.out.println(newStr);
            return;
        }
            char curr = str.charAt(index);
            if(curr!='x'){
                newStr += curr;
            }else{
                count++;
            }
        ClearStr(str, index+1, newStr, count);
    }
    public static void main(String[] args) {
        String str ="axbxcxexr";
        int index = 0;
        String newStr = " ";
        int count = 0;
        ClearStr(str, index, newStr, count);
    }
}
