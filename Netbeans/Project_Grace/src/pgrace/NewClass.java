//package pgrace;
//
//public class NewClass {
//     public void sendMsg(String msg) {
//        Socket msg_s = null;
//        PrintWriter msg_pw = null;
//        BufferedReader msg_br = null;
//        try {
//            msg_s = new Socket("HOST", PORT);
//            msg_pw = new PrintWriter(msg_s.getOutputStream(), true);
//            msg_br = new BufferedReader(new InputStreamReader(msg_s.getInputStream()));
//            msg_pw.println(msg);
//            String str = br.readLine(); // 블러킹 메서드
//            StringTokenizer stz = new StringTokenizer(str, "/");
//            //프로토콜을 분석해야 하는 구문
//            // talk/[null]xxx님/message
//            String token = stz.nextToken();
//            if (token.equals("id_check")) {
//                if (stz.nextToken().equals("true")) {
//                   id_check = true;
//                    join_label_id_checkv.setText("사용 가능한 아이디입니다.");
//                } else {
//                    id_check = false;
//                    join_label_id_checkv.setText("이미 존재하는 아이디입니다.");
//                }
//            } else if (token.equals("join")) {
//                // "join"/"true"/null/null/null/
//                if (stz.nextToken().equals("true")) {
//                    // 다이얼로그 ("축하합니다. 가입 되었습니다.")
//                } else {
//                    // 다이얼로그 ("가입에 실패하였습니다.")
//                }
//            }else if(token.equals("login")){
//                // login/true/null/null/null/
//                if (stz.nextToken().equals("true")) {
//                    login_flag = true;
//                } else {
//                    login_flag = false;
//                }
//            }else if(token.equals("nick")){
//                
//            }
//            
//        } catch (IOException ex) {
//            // 다이얼
//        } finally {
//            if (!msg_s.isClosed()) {
//                try {
//                    msg_pw.close();
//                    msg_br.close();
//                    msg_s.close();
//                } catch (IOException ex) {
//                }
//            }
//        }
//    }
//}
