package com.example.iot_android_project;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Dialog_a extends Dialog {
    public Dialog_a(Context context) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);   //다이얼로그의 타이틀바를 없애주는 옵션입니다.
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));  //다이얼로그의 배경을 투명으로 만듭니다.
        setContentView(R.layout.activity_dialog);     //다이얼로그에서 사용할 레이아웃입니다.

                getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));  //다이얼로그의 배경을 투명으로 만듭니다.
                setContentView(R.layout.activity_dialog);     //다이얼로그에서 사용할 레이아웃입니다.



                Spinner spinner1 = (Spinner)findViewById(R.id.spinner1);
                Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);
                Spinner spinner3 = (Spinner)findViewById(R.id.spinner3);

                final String[] spinner1_1 = {"서울", "경기", "인천", "강원", "충남", "대전", "충북", "세종", "부산", "울산", "대구", "경북", "경남", "전남", "광주", "전북", "제주"};

                ArrayAdapter<String> adapter;
                ArrayAdapter<String> adapter2;
                ArrayAdapter<String> adapter3;
                adapter = new ArrayAdapter<String>(context, R.layout.spinner, spinner1_1);
                spinner1.setAdapter(adapter);

                String[] spinner2_1;
                String[] spinner3_1 ;



                for(int i = 0; i<spinner1_1.length; i++){
                    if(i==0){
                        spinner2_1 = new String[]{"강남구", "강동구", "강북구","강서구", "관악구", "광진구", "구로구", "금천구", "노원구", "도봉구", "동대문구", "동작구",
                                "마포구", "서대문구", "서초구", "성동구", "성북구", "송파구", "양천구", "영등포구", "용산구", "용산구", "은평구", "종로구", "중구", "중랑구"};

                        adapter2 = new ArrayAdapter<String>(context, R.layout.spinner, spinner2_1);
                        spinner2.setAdapter(adapter2);


                        for(int j = 0; j<spinner2_1.length; j++){
                            if(j==0){
                                spinner3_1 = new String[]{"개포동", "논현동", "대치동", "도곡동", "삼성동", "세곡동", "수서동", "신사동", "압구정동", "역삼동", "율현동", "일원동", "일원본동", "자곡동", "청담동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);
                            }
                            else if(j==1){
                                spinner3_1 = new String[]{"강일동", "고덕동", "길동", "둔촌동", "명일동", "상일동", "성내동", "암사동", "천호동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);
                            }else if(j==2){
                                spinner3_1 = new String[]{"미아동", "번동", "삼각산동", "삼양동", "송중동", "송천동", "수유동", "우이동", "인수동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);
                            }else if(j==3){
                                spinner3_1 = new String[]{"가양동", "개화동", "공항동", "과해동", "내발산동", "등촌동", "마곡동", "방화동", "염창동", "오곡동", "오쇠동", "외발산동", "우장산동", "화곡동", "화곡본동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);
                            }else if(j==4){
                                spinner3_1 = new String[]{"나성대동", "난곡동", "난향동", "남현동", "대학동", "미성동", "보라매동", "봉천동", "삼성동", "서림동", "서원동", "성현동", "신림동", "신사동", "신원동", "은천동", "인헌동", "조원동", "중앙동", "청룡동", "청림동", "행운동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);
                            }else if(j==5){
                                spinner3_1 = new String[]{"광장동", "구의동", "군자동", "능동", "자양동", "중곡동", "화양동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);
                            }else if(j==6){
                                spinner3_1 = new String[]{"가리봉동", "개봉동", "고척동", "구로동", "궁동", "신도림동", "오류동", "온수동", "천왕동", "황동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);
                            }else if(j==7){
                                spinner3_1 = new String[]{"가산동", "독산동", "시흥동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);
                            }else if(j==8){
                                spinner3_1 = new String[]{"공릉동", "상계동", "월계동", "중계동", "하계동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);
                            }else if(j==9){
                                spinner3_1 = new String[]{"도봉동", "방학동", "쌍문동", "창동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);
                            }else if(j==10){
                                spinner3_1 = new String[]{"답십리동", "신설동", "용두동", "이문동", "장안동", "전농동", "제기동", "청량리동", "회기동", "휘경동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);
                            }else if(j==11){
                                spinner3_1 = new String[]{"노량진동", "대방동", "동작동", "본동", "사당동", "상도동", "신대방동", "흑석동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3); }
                            else if(j==12){
                                spinner3_1 = new String[]{"공덕동", "구수동", "노고산동", "당인동", "대흥동", "도화동", "동교동", "마포동", "망원동", "상수동", "삼암동", "서교동", "성산동", "신공덕동", "신수동", "신정동", "아현동", "연남동", "염리동", "용강동", "중동", "창전동", "토정동", "하중동", "합정동", "현석동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);}
                            else if(j==13){
                                spinner3_1 = new String[]{"남가좌동", "냉천동", "대신동", "대현동", "미근동", "봉원동", "북가좌동", "북아현동", "신촌동", "연희동", "영천동", "옥천동", "창천동", "천연동", "충정로", "합동", "현저동", "홍은동", "홍제동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);}
                            else if(j==14){
                                spinner3_1 = new String[]{"내곡동", "반포동","반포본동", "방배동", "방배본동", "서초동", "신원동", "양재동", "염곡동", "우면동", "원지동", "잠원동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);}
                            else if(j==15){
                                spinner3_1 = new String[]{"금호동", "도선동", "마장동", "사근동", "상왕십리동", "성수동", "송정동", "옥수동", "왕십리동", "용답동", "응봉동", "하왕십리동", "해당동", "홍익동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);}
                            else if(j==16){
                                spinner3_1 = new String[]{"길음동", "돈암동", "동선동", "동소문동", "보문동", "삼선동", "상월곡동", "석관동", "성북동", "안암동", "월곡동", "장위동", "정릉동", "종암동", "하월곡동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);}
                            else if(j==17){
                                spinner3_1 = new String[]{"가락동", "가락본동", "거여동", "마천동", "문정동", "방이동", "삼전동", "석촌동", "송파동", "신천동", "오금동", "오륜동", "위례동", "잠실동", "잠실본동", "장지동", "풍납동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);}
                            else if(j==18){
                                spinner3_1 = new String[]{"목동", "신월동", "신정동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);}
                            else if(j==19){
                                spinner3_1 = new String[]{"당산동", "대림동", "도림동", "문래동", "신길동", "양평동", "양화동", "여의도동", "영등포동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);
                            }else if(j==20){
                                spinner3_1 = new String[]{"갈월동", "남영동", "도원동", "동빙고동", "동자동", "문배동", "보광동", "산천동", "서계동", "서빙고동", "신계동", "신창동", "용문동", "용산동", "원효로", "이촌동", "이태원동", "주성동", "청암동", "청파동", "한강로", "한남동", "효창동", "후암동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);
                            }else if(j==21){
                                spinner3_1 = new String[]{"갈현동", "구산동", "녹번동", "대조동", "불광동", "수색동", "신사동", "역촌동", "응암동", "증산동", "진관동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);
                            }else if(j==22){
                                spinner3_1 = new String[]{"가회동", "견지동", "경운동", "계동", "공평동", "관수동", "관철동", "관훈동", "교남동", "교북동", "구기동", "궁정동", "권농동", "낙원동", "내수동", "내자동", "누상동", "누하동", "당주동", "도렴동", "돈의동", "동숭동", "명륜동", "묘동", "무악동", "봉익동", "부암동", "사간동", "사직동", "삼청동", "서린동", "세종로", "소격동", "송원동", "송현동", "수송동", "숭인동", "신교동", "신문로", "신영동", "안국동", "연견동", "연지동", "예지동", "옥인동",
                                        "와룡동", "운니동", "원남동", "원서동", "이화동", "익선동", "인사동", "인의동", "장사동", "재동", "적선동", "종로", "중학동", "창성동", "창신동", "청운동", "청진동", "체부동", "충신동", "통의동", "통인동", "팔판동", "평동", "평창동", "필운동", "행촌동", "혜화동", "홍지동", "홍파동", "화동", "효자동", "효제동", "훈제동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);
                            }else if(j==23){
                                spinner3_1 = new String[]{"광희동", "남대문로", "남산동", "남창동", "남학동", "다동", "만리동", "명동", "무교동", "무학동", "묵정동", "방산동", "봉래동", "북창동", "산림동", "삼각동", "서소문동", "소공동", "수표동", "수하동", "순화동", "신당동", "쌍림동", "예관동", "예장동", "오장동", "을지로", "의주로", "인현동", "입정동", "장교동", "장충동", "저동", "정동", "주교동", "주자동", "중림동", "초동", "충무로", "충정로", "태평로", "필동", "황학동", "회현동", "흥인동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);
                            }else if(j==24){
                                spinner3_1 = new String[]{"망우동", "망우본동", "면목동", "면목본동", "묵동", "상봉동", "신내동", "중화동"};
                                adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                spinner3.setAdapter(adapter3);
                            }
                        }
                    }
                }



            }
        }




