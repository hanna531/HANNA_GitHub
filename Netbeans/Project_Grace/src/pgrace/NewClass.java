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
//            String str = br.readLine(); // ��ŷ �޼���
//            StringTokenizer stz = new StringTokenizer(str, "/");
//            //���������� �м��ؾ� �ϴ� ����
//            // talk/[null]xxx��/message
//            String token = stz.nextToken();
//            if (token.equals("id_check")) {
//                if (stz.nextToken().equals("true")) {
//                   id_check = true;
//                    join_label_id_checkv.setText("��� ������ ���̵��Դϴ�.");
//                } else {
//                    id_check = false;
//                    join_label_id_checkv.setText("�̹� �����ϴ� ���̵��Դϴ�.");
//                }
//            } else if (token.equals("join")) {
//                // "join"/"true"/null/null/null/
//                if (stz.nextToken().equals("true")) {
//                    // ���̾�α� ("�����մϴ�. ���� �Ǿ����ϴ�.")
//                } else {
//                    // ���̾�α� ("���Կ� �����Ͽ����ϴ�.")
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
//            // ���̾�
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
