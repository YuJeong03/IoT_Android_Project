package com.example.iot_android_project;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Dialog_a extends Dialog {
    public Dialog_a(final Context context) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);   //다이얼로그의 타이틀바를 없애주는 옵션입니다.
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));  //다이얼로그의 배경을 투명으로 만듭니다.
        setContentView(R.layout.activity_dialog);     //다이얼로그에서 사용할 레이아웃입니다.

                getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));  //다이얼로그의 배경을 투명으로 만듭니다.
                setContentView(R.layout.activity_dialog);     //다이얼로그에서 사용할 레이아웃입니다.

        Button btn = (Button)findViewById(R.id.button);
                final Spinner spinner1 = (Spinner)findViewById(R.id.spinner1);
                final Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);
                final Spinner spinner3 = (Spinner)findViewById(R.id.spinner3);

                final String[] spinner1_1 = {"서울", "경기", "인천", "강원", "충남", "대전", "충북", "세종", "부산", "울산", "대구", "경북", "경남", "전남", "광주", "전북", "제주"};

                ArrayAdapter<String> adapter;

                adapter = new ArrayAdapter<String>(context, R.layout.spinner, spinner1_1);
                spinner1.setAdapter(adapter);

                spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        if(spinner1.getSelectedItem().toString().equals("서울")){
                            String[] spinner2_1 = new String[]{"강남구", "강동구", "강북구","강서구", "관악구", "광진구", "구로구", "금천구", "노원구", "도봉구", "동대문구", "동작구",
                                    "마포구", "서대문구", "서초구", "성동구", "성북구", "송파구", "양천구", "영등포구", "용산구", "은평구", "종로구", "중구", "중랑구"};

                            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(context, R.layout.spinner, spinner2_1);
                            spinner2.setAdapter(adapter2);

                            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                        if(spinner2.getSelectedItem().toString().equals("강남구")){
                                            String[] spinner3_1 = new String[]{"개포동", "논현동", "대치동", "도곡동", "삼성동", "세곡동", "수서동", "신사동", "압구정동", "역삼동", "율현동", "일원동", "일원본동", "자곡동", "청담동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);
                                        }
                                        else if(spinner2.getSelectedItem().toString().equals("강동구")){
                                            String[] spinner3_1 = new String[]{"강일동", "고덕동", "길동", "둔촌동", "명일동", "상일동", "성내동", "암사동", "천호동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);
                                        }else if(spinner2.getSelectedItem().toString().equals("강북구")){
                                            String[] spinner3_1 = new String[]{"미아동", "번동", "삼각산동", "삼양동", "송중동", "송천동", "수유동", "우이동", "인수동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);
                                        }else if(spinner2.getSelectedItem().toString().equals("강서구")){
                                            String[] spinner3_1 = new String[]{"가양동", "개화동", "공항동", "과해동", "내발산동", "등촌동", "마곡동", "방화동", "염창동", "오곡동", "오쇠동", "외발산동", "우장산동", "화곡동", "화곡본동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);
                                        }else if(spinner2.getSelectedItem().toString().equals("관악구")){
                                            String[] spinner3_1 = new String[]{"나성대동", "난곡동", "난향동", "남현동", "대학동", "미성동", "보라매동", "봉천동", "삼성동", "서림동", "서원동", "성현동", "신림동", "신사동", "신원동", "은천동", "인헌동", "조원동", "중앙동", "청룡동", "청림동", "행운동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);
                                        }else if(spinner2.getSelectedItem().toString().equals("광진구")){
                                            String[] spinner3_1 = new String[]{"광장동", "구의동", "군자동", "능동", "자양동", "중곡동", "화양동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);
                                        }else if(spinner2.getSelectedItem().toString().equals("구로구")){
                                            String[] spinner3_1 = new String[]{"가리봉동", "개봉동", "고척동", "구로동", "궁동", "신도림동", "오류동", "온수동", "천왕동", "황동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);
                                        }else if(spinner2.getSelectedItem().toString().equals("금천구")){
                                            String[] spinner3_1 = new String[]{"가산동", "독산동", "시흥동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);
                                        }else if(spinner2.getSelectedItem().toString().equals("노원구")){
                                            String[] spinner3_1 = new String[]{"공릉동", "상계동", "월계동", "중계동", "하계동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);
                                        }else if(spinner2.getSelectedItem().toString().equals("도봉구")){
                                            String[] spinner3_1 = new String[]{"도봉동", "방학동", "쌍문동", "창동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);
                                        }else if(spinner2.getSelectedItem().toString().equals("동대문구")){
                                            String[] spinner3_1 = new String[]{"답십리동", "신설동", "용두동", "이문동", "장안동", "전농동", "제기동", "청량리동", "회기동", "휘경동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3); }
                                        else if(spinner2.getSelectedItem().toString().equals("동작구")){
                                            String[] spinner3_1 = new String[]{"노량진동", "대방동", "동작동", "본동", "사당동", "상도동", "신대방동", "흑석동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3); }
                                        else if(spinner2.getSelectedItem().toString().equals("마포구")){
                                            String[] spinner3_1 = new String[]{"공덕동", "구수동", "노고산동", "당인동", "대흥동", "도화동", "동교동", "마포동", "망원동", "상수동", "삼암동", "서교동", "성산동", "신공덕동", "신수동", "신정동", "아현동", "연남동", "염리동", "용강동", "중동", "창전동", "토정동", "하중동", "합정동", "현석동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);}
                                        else if(spinner2.getSelectedItem().toString().equals("서대문구")){
                                            String[] spinner3_1 = new String[]{"남가좌동", "냉천동", "대신동", "대현동", "미근동", "봉원동", "북가좌동", "북아현동", "신촌동", "연희동", "영천동", "옥천동", "창천동", "천연동", "충정로", "합동", "현저동", "홍은동", "홍제동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);}
                                        else if(spinner2.getSelectedItem().toString().equals("서초구")){
                                            String[] spinner3_1 = new String[]{"내곡동", "반포동","반포본동", "방배동", "방배본동", "서초동", "신원동", "양재동", "염곡동", "우면동", "원지동", "잠원동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);}
                                        else if(spinner2.getSelectedItem().toString().equals("성동구")){
                                            String[] spinner3_1 = new String[]{"금호동", "도선동", "마장동", "사근동", "상왕십리동", "성수동", "송정동", "옥수동", "왕십리동", "용답동", "응봉동", "하왕십리동", "해당동", "홍익동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);}
                                        else if(spinner2.getSelectedItem().toString().equals("성북구")){
                                            String[] spinner3_1 = new String[]{"길음동", "돈암동", "동선동", "동소문동", "보문동", "삼선동", "상월곡동", "석관동", "성북동", "안암동", "월곡동", "장위동", "정릉동", "종암동", "하월곡동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);}
                                        else if(spinner2.getSelectedItem().toString().equals("송파구")){
                                            String[] spinner3_1 = new String[]{"가락동", "가락본동", "거여동", "마천동", "문정동", "방이동", "삼전동", "석촌동", "송파동", "신천동", "오금동", "오륜동", "위례동", "잠실동", "잠실본동", "장지동", "풍납동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);}
                                        else if(spinner2.getSelectedItem().toString().equals("양천구")){
                                            String[] spinner3_1 = new String[]{"목동", "신월동", "신정동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);}
                                        else if(spinner2.getSelectedItem().toString().equals("영등포구")){
                                            String[] spinner3_1 = new String[]{"당산동", "대림동", "도림동", "문래동", "신길동", "양평동", "양화동", "여의도동", "영등포동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);
                                        }
                                        else if(spinner2.getSelectedItem().toString().equals("용산구")){
                                            String[] spinner3_1 = new String[]{"갈월동", "남영동", "도원동", "동빙고동", "동자동", "문배동", "보광동", "산천동", "서계동", "서빙고동", "신계동", "신창동", "용문동", "용산동", "원효로", "이촌동", "이태원동", "주성동", "청암동", "청파동", "한강로", "한남동", "효창동", "후암동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);
                                        }else if(spinner2.getSelectedItem().toString().equals("은평구")){
                                            String[] spinner3_1 = new String[]{"갈현동", "구산동", "녹번동", "대조동", "불광동", "수색동", "신사동", "역촌동", "응암동", "증산동", "진관동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);
                                        }else if(spinner2.getSelectedItem().toString().equals("종로구")){
                                            String[] spinner3_1 = new String[]{"가회동", "견지동", "경운동", "계동", "공평동", "관수동", "관철동", "관훈동", "교남동", "교북동", "구기동", "궁정동", "권농동", "낙원동", "내수동", "내자동", "누상동", "누하동", "당주동", "도렴동", "돈의동", "동숭동", "명륜동", "묘동", "무악동", "봉익동", "부암동", "사간동", "사직동", "삼청동", "서린동", "세종로", "소격동", "송원동", "송현동", "수송동", "숭인동", "신교동", "신문로", "신영동", "안국동", "연견동", "연지동", "예지동", "옥인동",
                                                    "와룡동", "운니동", "원남동", "원서동", "이화동", "익선동", "인사동", "인의동", "장사동", "재동", "적선동", "종로", "중학동", "창성동", "창신동", "청운동", "청진동", "체부동", "충신동", "통의동", "통인동", "팔판동", "평동", "평창동", "필운동", "행촌동", "혜화동", "홍지동", "홍파동", "화동", "효자동", "효제동", "훈제동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);
                                        }else if(spinner2.getSelectedItem().toString().equals("중구")){
                                            String[] spinner3_1 = new String[]{"광희동", "남대문로", "남산동", "남창동", "남학동", "다동", "만리동", "명동", "무교동", "무학동", "묵정동", "방산동", "봉래동", "북창동", "산림동", "삼각동", "서소문동", "소공동", "수표동", "수하동", "순화동", "신당동", "쌍림동", "예관동", "예장동", "오장동", "을지로", "의주로", "인현동", "입정동", "장교동", "장충동", "저동", "정동", "주교동", "주자동", "중림동", "초동", "충무로", "충정로", "태평로", "필동", "황학동", "회현동", "흥인동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);
                                        }else if(spinner2.getSelectedItem().toString().equals("중랑구")){
                                            String[] spinner3_1 = new String[]{"망우동", "망우본동", "면목동", "면목본동", "묵동", "상봉동", "신내동", "중화동"};
                                            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                            spinner3.setAdapter(adapter3);
                                        }
                                    }
                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {
                                }
                            });
                        }
                        else if(spinner1.getSelectedItem().toString().equals("경기")) {
                            String[] spinner2_1 = new String[]{"가평군", "고양시 덕양구", "고양시 일산동구","고양시 일산서구", "과천시", "광명시", "광주시", "구리시", "군포시", "김포시", "남양주시", "동두천시",
                                    "부천시", "성남시 분당구", "성남시 수정구", "성남시 중원구", "수원시 권선구", "수원시 영통구", "수원시 장안구", "수원시 팔달구", "시흥시", "안산시 단원구", "안산시 상록구", "안성시", "안양시 동안구",
                                    "안양시 만안구", "양주시", "양평군", "여주시", "연천군", "오산시", "용인시 기흥구", "용인시 수지구", "용인시 처인구", "의왕시", "의정부시", "이천시", "파주시", "평택시", "포천시", "하남시", "화성시"};
                            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(context, R.layout.spinner, spinner2_1);
                            spinner2.setAdapter(adapter2);

                            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if(spinner2.getSelectedItem().toString().equals("가평군")){
                                        String[] spinner3_1 = new String[]{"가평읍", "북면", "상면", "설악면", "조종면", "청평면", "하면"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3);
                                    }else if(spinner2.getSelectedItem().toString().equals("고양시 덕양구")) {
                                        String[] spinner3_1 = new String[]{"강매동", "고양동", "관산동", "내곡동", "내유동", "대자동", "대장동", "덕은동", "도내동", "동산동", "벽제동", "북한동", "삼송동", "선유동", "성사동", "신원동", "신평동", "오금동", "용두동", "원당동", "원흥동", "주교동", "지축동", "토당동", "행신동", "행주내동", "행주외동", "향동동", "현천동", "화전동", "화정동", "효자동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3);
                                    } else if(spinner2.getSelectedItem().toString().equals("고양시 일산동구")){
                                        String[] spinner3_1 = new String[]{"마두동", "문봉동", "백석동", "사리현동", "산황동", "설문동", "성석동", "식사동", "장항동", "정발산동", "중산동", "지영동", "풍동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3);
                                    }
                                    else if(spinner2.getSelectedItem().toString().equals("고양시 일산서구")){
                                        String[] spinner3_1 = new String[]{"가좌동", "구산동", "대화동", "덕이동", "법곳동", "일산동", "주엽동", "탄현동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3);
                                    }else if(spinner2.getSelectedItem().toString().equals("과천시")){
                                        String[] spinner3_1 = new String[]{"갈현동", "과천동", "관문동", "막계동", "문원동", "별양동", "부림동", "원문동", "주암동", "중앙동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3);
                                    }else if(spinner2.getSelectedItem().toString().equals("광명시")){
                                        String[] spinner3_1 = new String[]{"가학동", "광명동", "노온사동", "소하동", "옥길동", "일직동", "철산동", "하안동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3);
                                    }else if(spinner2.getSelectedItem().toString().equals("광주시")){
                                        String[] spinner3_1 = new String[]{"경안동", "곤지암읍", "남종면", "도척면", "목동", "목현동", "삼동", "송정동", "쌍령동", "역동", "오포읍", "장지동", "중대동", "중부면", "직동", "초월읍", "탄벌동", "태전동", "퇴촌면", "회덕동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3);
                                    }else if(spinner2.getSelectedItem().toString().equals("구리시")){
                                        String[] spinner3_1 = new String[]{"갈매동", "교문동", "동구동", "사노동", "수택동", "아천동", "인창동", "토평동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3);
                                    }else if(spinner2.getSelectedItem().toString().equals("군포시")){
                                        String[] spinner3_1 = new String[]{"광정동", "군포동", "궁내동", "금정동", "당동", "당정동", "대야미동", "도마교동", "둔대동", "부곡동", "산본동", "속달동", "수리동", "오금동", "재궁동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3);
                                    }else if(spinner2.getSelectedItem().toString().equals("김포시")){
                                        String[] spinner3_1 = new String[]{"감정동", "걸포동", "고촌읍", "구래동", "김포동", "대곶면", "마산동", "북변동", "사우동", "양촌읍", "운양동", "월곶면", "장기동", "통진읍", "풍무동", "하성면"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3);
                                    }else if(spinner2.getSelectedItem().toString().equals("동대문구")){
                                        String[] spinner3_1 = new String[]{"답십리동", "신설동", "용두동", "이문동", "장안동", "전농동", "제기동", "청량리동", "회기동", "휘경동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("남양주시")){
                                        String[] spinner3_1 = new String[]{"가운동", "금곡동", "다산동", "도농동", "별내동", "별내면", "삼패동", "수동면", "수석동", "양정동", "오남읍", "와부읍", "이패동", "일패동", "조안면", "지금동", "진건읍", "진접읍" ,"퇴계원면", "평내동", "호평동", "화도읍"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("동두천시")){
                                        String[] spinner3_1 = new String[]{"걸산동", "광암동", "동두천동", "보산동", "상봉암동", "상패동", "생연동", "송내동", "안흥동", "중앙동", "지행동", "탕동동", "하봉암동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("부천시")){
                                        String[] spinner3_1 = new String[]{"계수동", "고강동", "고강본동", "괴안동", "내동", "대장동", "도당동", "범박동", "삼정동", "상동", "소사동", "소사본동", "송내동", "심곡동", "심곡본동", "약대동", "여월동", "역곡동", "오정동", "옥길동", "원미동", "원종동", "작동", "중동", "춘의동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("성남시 분당구")){
                                        String[] spinner3_1 = new String[]{"구미동", "궁내동", "금곡동", "대장동", "동원동", "백현동", "분당동", "삼평동", "서현동", "석운동", "수내동", "야탑동", "운중동", "율동", "이매동", "정자동", "판교동", "하산운동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("성남시 수정구")){
                                        String[] spinner3_1 = new String[]{"고등동", "금토동", "단대동", "둔전동", "복정동", "사송동", "산성동", "상적동", "수진동", "시흥동", "신촌동", "신흥동", "심곡동", "양지동", "오야동", "위례동", "창곡동", "태평동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("성남시 중원구")){
                                        String[] spinner3_1 = new String[]{"갈현동", "금광동", "도촌동", "상대원동", "성남동", "여수동", "은행동", "중앙동", "하대원동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("수원시 권선구")){
                                        String[] spinner3_1 = new String[]{"고색동", "곡반정동", "구운동", "권선동", "금곡동", "당수동", "대황교동", "서둔동", "세류동", "오목천동", "입북동" ,"장지동", "탑동", "평동", "평리동", "호매실동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("수원시 영통구")){
                                        String[] spinner3_1 = new String[]{"망포동", "매탄동", "신동", "영통동", "원천동", "이의동", "하동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("수원시 장안구")){
                                        String[] spinner3_1 = new String[]{"상광교동", "송죽동", "연무동", "영화동", "율전동", "이목동", "정자동", "조원동", "천천동","파장동", "하광교동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("수원시 팔달구")){
                                        String[] spinner3_1 = new String[]{"고등동", "교동", "구천동", "남수동", "남창동", "매교동", "매산로", "매향동", "북수동","신풍동", "영동", "우만동", "인계동", "장안동", "중동", "지동", "팔달로", "화서동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("시흥시")){
                                        String[] spinner3_1 = new String[]{"거모동", "계수동", "과림동", "광석동", "군자동", "금이동", "논곡동", "능곡동", "대야동","도창동", "매화동", "목감동", "무지내동", "물왕동", "미산동", "방산동", "산현동", "신천동", "안현동", "월곶동", "은행동", "장곡동", "장현동", "정왕동", "정왕본동", "조남동", "죽율동", "포동", "하상동", "하중동", "화정동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("안산시 단원구")){
                                        String[] spinner3_1 = new String[]{"고잔동", "대부남동", "대부동동", "대부북동", "목내동", "선감동", "선부동", "성곡동", "신길동","와동", "원곡동", "원시동", "초지동", "풍도동", "화정동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("안산시 상록구")){
                                        String[] spinner3_1 = new String[]{"건건동", "본오동", "부곡동", "사동", "사사동", "성포동", "수암동", "양상동", "월피동","이동", "일동", "장상동", "장하동", "팔곡이동", "팔곡일동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("안성시")){
                                        String[] spinner3_1 = new String[]{"가사동", "가현동", "계동", "고삼동", "고동읍", "구포동", "금광동", "금산동", "금석동","낙원동", "당왕동", "대덕면", "대천동", "도기동", "동본동", "명륜동", "미양면", "발화동", "보개면", "봉남동" , "봉산동", "사곡동", "삼죽면", "서운면", "서인동", "석정동", "성남동", "숭인동", "신건지동", "신모산동", "신소현동", "신흥동", "아양동", "안성동", "양성면", "연지동", "영동", "옥산동", "옥천동", "원곡면", "인지동", "일죽면", "죽산면", "중리동", "창전동", "현수동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("안양시 동안구")){
                                        String[] spinner3_1 = new String[]{"갈산동", "관양동", "귀인동", "달안동", "범계동", "부림동", "부흥동", "비산동", "신촌동","평안동", "평촌동", "호계동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("안양시 만안구")){
                                        String[] spinner3_1 = new String[]{"박달동", "석수동", "안양동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("양주시")){
                                        String[] spinner3_1 = new String[]{"고암동", "고읍동", "광사동", "광적면", "남면", "남방동", "덕계동", "덕정동", "마전동","만송동", "백석읍", "복양동", "산북동", "삼숭동", "어둔동", "옥정동", "유양동", "율정동", "은현면", "장흥면", "회암동", "회정동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("양평군")){
                                        String[] spinner3_1 = new String[]{"강상면", "강하면", "개군면", "단월면", "서종면", "양동면", "양서면", "양평읍", "옥천면","용문면", "지평면", "청운면"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("여주시")){
                                        String[] spinner3_1 = new String[]{"가남읍", "가업동", "강천면", "교동", "금사면", "능서면", "능현동", "단현동", "대신면","매룡동", "멱곡동", "북내면", "산북면", "삼교동", "상거동", "상동", "신진동", "연라동", "연양동", "오금동", "오학동", "우만동", "월송동", "점동면", "점봉동", "창동", "천송동","하거동", "하동", "현암동", "홍문동", "흥천면"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("연천군")){
                                        String[] spinner3_1 = new String[]{"군남면", "미산면", "백학면", "신서면", "연천읍", "왕진면", "장남면", "전곡읍", "중면","청산면"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("오산시")){
                                        String[] spinner3_1 = new String[]{"가수동", "가장동", "갈곶동", "고현동", "궐동", "금암동", "내삼미동", "누읍동", "두곡동","벌음동", "부산동", "서동", "서랑동", "세교동", "수청동", "양산동", "오산동", "외삼미동", "원동", "은계동", "지곶동", "청학동", "청호동", "탑동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("용인시 기흥구")){
                                        String[] spinner3_1 = new String[]{"고매동", "공세동", "구갈동", "농서동", "동백동", "마북동", "보라동", "보정동", "상갈동","상하동", "서천동", "신갈동", "언남동", "영덕동", "중동","지곡동", "청덕동", "하갈동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("용인시 수지구")){
                                        String[] spinner3_1 = new String[]{"고기동", "동천동", "상현동", "성복동", "신봉동", "죽전동", "풍덕천동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("용인시 처인구")){
                                        String[] spinner3_1 = new String[]{"고림동", "김량장동", "남동", "남사면", "마평동", "모현읍", "백암면", "삼가동", "양지면","역북동", "운학동", "원삼면", "유방동", "이동면", "포곡읍","해곡동", "호동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("의왕시")){
                                        String[] spinner3_1 = new String[]{"고천동", "내손동", "삼동", "오전면", "왕곡동", "월암동", "이동", "청계동", "초평동","포일동", "학의동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("의정부시")){
                                        String[] spinner3_1 = new String[]{"가능동", "고산동", "금오동", "낙양동", "녹양동", "민락동", "산곡동", "신곡동", "용현동","의정부동", "자일동","장암동", "호원동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("이천시")){
                                        String[] spinner3_1 = new String[]{"갈산동", "고담동", "관고동", "단월동", "대월면", "대포동", "마장면", "모가면", "백사면","부발읍", "사음동","설성면", "송정동", "신둔면", "안흥동", "율면", "율현동", "장록동", "장호원읍", "중리동", "중일동", "증포동", "진리동", "창전동", "호법면"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("이천시")){
                                        String[] spinner3_1 = new String[]{"검산동","광탄면","교하동", "교하읍","군내면","금능동","금촌동","다율동","당하동","동패동","맥금동","목동동","문발동","문산읍","법원읍","산남동","상지석동","서패동","송촌동","신촌동","아동동","야당동","야동동","연다산동","오도동","와동동","운정동","월롱면","장단면","적성면","조리읍","진동면","진서면","탄현면","파주읍","파평면","하지석동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("평택시")){
                                        String[] spinner3_1 = new String[]{"가재동","고덕면","군문동", "도일동","독곡동","동삭동","모곡동","비전동","서정동","서탄면","세교동","소사동","신대동","신장동","안중읍","오성면","용이동","원평동","월곡동","유천동","이충동","장당동","장안동","죽백동","지산동","지제동","진위면","청룡동","청북면","칠괴동","칠원동","통복동","팽성읍","평택동","포승읍","합정동","현덕면"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("포천시")){
                                        String[] spinner3_1 = new String[]{"가산면","관인면","군내면", "내촌면","동교동","선단동","설운동","소흘읍","신북면","신읍동","어룡동","영북면","영중면","이동면","자작동","창수면","화현면"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("하남시")){
                                        String[] spinner3_1 = new String[]{"감북동","감이동","감일동", "광암동","교산동","덕풍동","망월동","미사동","배알미동","상사창동","상산곡동","선동","신장동","위례동","창우동","천현동","초이동", "초일동", "춘궁동", "풍산동", "하사창동", "하산곡동", "학암동", "항동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }
                                    else if(spinner2.getSelectedItem().toString().equals("화성시")){
                                        String[] spinner3_1 = new String[]{"금곡동","기배동","기산동", "기안동","남양읍","능동","동탄동","동탄면","마도면","매송면","목동","반송동","반월동","반정동","반교동","배양동","병점동", "봉담읍", "비봉면", "산척동", "새솔동", "서신면", "석우동", "송동", "송산동", "송산면", "신동", "안녕동", "양감면", "영천동", "오산동" ,"우정읍","장안면", "장지동", "정남면", "중동", "진안동", "청계동", "팔탄면", "향남읍", "화산동", "황계동"};
                                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(context, R.layout.spinner, spinner3_1);
                                        spinner3.setAdapter(adapter3); }

                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                        }

                        else if(spinner1.getSelectedItem().toString().equals("인천")) {
                            String[] spinner2_1 = new String[]{"가평군", "고양시 덕양구", "고양시 일산동구","고양시 일산서구", "과천시", "광명시", "광주시", "구리시", "군포시", "김포시", "남양주시", "동두천시",
                                    "부천시", "성남시 분당구", "성남시 수정구", "성남시 중원구", "수원시 권선구", "수원시 영통구", "수원시 장안구", "수원시 팔달구", "시흥시", "안산시 단원구", "안산시 상록구", "안성시", "안양시 동안구",
                                    "안양시 만안구", "양주시", "양평군", "여주시", "연천군", "오산시", "용인시 기흥구", "용인시 수지구", "용인시 처인구", "의왕시", "의정부시", "이천시", "파주시", "평택시", "포천시", "하남시", "화성시"};
                            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(context, R.layout.spinner, spinner2_1);
                            spinner2.setAdapter(adapter2);

                            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                        }

                        else if(spinner1.getSelectedItem().toString().equals("강원")) {
                            String[] spinner2_1 = new String[]{"가평군", "고양시 덕양구", "고양시 일산동구","고양시 일산서구", "과천시", "광명시", "광주시", "구리시", "군포시", "김포시", "남양주시", "동두천시",
                                    "부천시", "성남시 분당구", "성남시 수정구", "성남시 중원구", "수원시 권선구", "수원시 영통구", "수원시 장안구", "수원시 팔달구", "시흥시", "안산시 단원구", "안산시 상록구", "안성시", "안양시 동안구",
                                    "안양시 만안구", "양주시", "양평군", "여주시", "연천군", "오산시", "용인시 기흥구", "용인시 수지구", "용인시 처인구", "의왕시", "의정부시", "이천시", "파주시", "평택시", "포천시", "하남시", "화성시"};
                            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(context, R.layout.spinner, spinner2_1);
                            spinner2.setAdapter(adapter2);

                            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                        }

                        else if(spinner1.getSelectedItem().toString().equals("충남")) {
                            String[] spinner2_1 = new String[]{"가평군", "고양시 덕양구", "고양시 일산동구","고양시 일산서구", "과천시", "광명시", "광주시", "구리시", "군포시", "김포시", "남양주시", "동두천시",
                                    "부천시", "성남시 분당구", "성남시 수정구", "성남시 중원구", "수원시 권선구", "수원시 영통구", "수원시 장안구", "수원시 팔달구", "시흥시", "안산시 단원구", "안산시 상록구", "안성시", "안양시 동안구",
                                    "안양시 만안구", "양주시", "양평군", "여주시", "연천군", "오산시", "용인시 기흥구", "용인시 수지구", "용인시 처인구", "의왕시", "의정부시", "이천시", "파주시", "평택시", "포천시", "하남시", "화성시"};
                            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(context, R.layout.spinner, spinner2_1);
                            spinner2.setAdapter(adapter2);

                            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                        }

                        else if(spinner1.getSelectedItem().toString().equals("대전")) {
                            String[] spinner2_1 = new String[]{"가평군", "고양시 덕양구", "고양시 일산동구","고양시 일산서구", "과천시", "광명시", "광주시", "구리시", "군포시", "김포시", "남양주시", "동두천시",
                                    "부천시", "성남시 분당구", "성남시 수정구", "성남시 중원구", "수원시 권선구", "수원시 영통구", "수원시 장안구", "수원시 팔달구", "시흥시", "안산시 단원구", "안산시 상록구", "안성시", "안양시 동안구",
                                    "안양시 만안구", "양주시", "양평군", "여주시", "연천군", "오산시", "용인시 기흥구", "용인시 수지구", "용인시 처인구", "의왕시", "의정부시", "이천시", "파주시", "평택시", "포천시", "하남시", "화성시"};
                            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(context, R.layout.spinner, spinner2_1);
                            spinner2.setAdapter(adapter2);

                            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                        }

                        else if(spinner1.getSelectedItem().toString().equals("충북")) {
                            String[] spinner2_1 = new String[]{"가평군", "고양시 덕양구", "고양시 일산동구","고양시 일산서구", "과천시", "광명시", "광주시", "구리시", "군포시", "김포시", "남양주시", "동두천시",
                                    "부천시", "성남시 분당구", "성남시 수정구", "성남시 중원구", "수원시 권선구", "수원시 영통구", "수원시 장안구", "수원시 팔달구", "시흥시", "안산시 단원구", "안산시 상록구", "안성시", "안양시 동안구",
                                    "안양시 만안구", "양주시", "양평군", "여주시", "연천군", "오산시", "용인시 기흥구", "용인시 수지구", "용인시 처인구", "의왕시", "의정부시", "이천시", "파주시", "평택시", "포천시", "하남시", "화성시"};
                            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(context, R.layout.spinner, spinner2_1);
                            spinner2.setAdapter(adapter2);

                            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                        }

                        else if(spinner1.getSelectedItem().toString().equals("세종")) {
                            String[] spinner2_1 = new String[]{"가평군", "고양시 덕양구", "고양시 일산동구","고양시 일산서구", "과천시", "광명시", "광주시", "구리시", "군포시", "김포시", "남양주시", "동두천시",
                                    "부천시", "성남시 분당구", "성남시 수정구", "성남시 중원구", "수원시 권선구", "수원시 영통구", "수원시 장안구", "수원시 팔달구", "시흥시", "안산시 단원구", "안산시 상록구", "안성시", "안양시 동안구",
                                    "안양시 만안구", "양주시", "양평군", "여주시", "연천군", "오산시", "용인시 기흥구", "용인시 수지구", "용인시 처인구", "의왕시", "의정부시", "이천시", "파주시", "평택시", "포천시", "하남시", "화성시"};
                            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(context, R.layout.spinner, spinner2_1);
                            spinner2.setAdapter(adapter2);

                            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                        }

                        else if(spinner1.getSelectedItem().toString().equals("부산")) {
                            String[] spinner2_1 = new String[]{"가평군", "고양시 덕양구", "고양시 일산동구","고양시 일산서구", "과천시", "광명시", "광주시", "구리시", "군포시", "김포시", "남양주시", "동두천시",
                                    "부천시", "성남시 분당구", "성남시 수정구", "성남시 중원구", "수원시 권선구", "수원시 영통구", "수원시 장안구", "수원시 팔달구", "시흥시", "안산시 단원구", "안산시 상록구", "안성시", "안양시 동안구",
                                    "안양시 만안구", "양주시", "양평군", "여주시", "연천군", "오산시", "용인시 기흥구", "용인시 수지구", "용인시 처인구", "의왕시", "의정부시", "이천시", "파주시", "평택시", "포천시", "하남시", "화성시"};
                            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(context, R.layout.spinner, spinner2_1);
                            spinner2.setAdapter(adapter2);

                            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                        }

                        else if(spinner1.getSelectedItem().toString().equals("울산")) {
                            String[] spinner2_1 = new String[]{"가평군", "고양시 덕양구", "고양시 일산동구","고양시 일산서구", "과천시", "광명시", "광주시", "구리시", "군포시", "김포시", "남양주시", "동두천시",
                                    "부천시", "성남시 분당구", "성남시 수정구", "성남시 중원구", "수원시 권선구", "수원시 영통구", "수원시 장안구", "수원시 팔달구", "시흥시", "안산시 단원구", "안산시 상록구", "안성시", "안양시 동안구",
                                    "안양시 만안구", "양주시", "양평군", "여주시", "연천군", "오산시", "용인시 기흥구", "용인시 수지구", "용인시 처인구", "의왕시", "의정부시", "이천시", "파주시", "평택시", "포천시", "하남시", "화성시"};
                            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(context, R.layout.spinner, spinner2_1);
                            spinner2.setAdapter(adapter2);

                            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                        }

                        else if(spinner1.getSelectedItem().toString().equals("대구")) {
                            String[] spinner2_1 = new String[]{"가평군", "고양시 덕양구", "고양시 일산동구","고양시 일산서구", "과천시", "광명시", "광주시", "구리시", "군포시", "김포시", "남양주시", "동두천시",
                                    "부천시", "성남시 분당구", "성남시 수정구", "성남시 중원구", "수원시 권선구", "수원시 영통구", "수원시 장안구", "수원시 팔달구", "시흥시", "안산시 단원구", "안산시 상록구", "안성시", "안양시 동안구",
                                    "안양시 만안구", "양주시", "양평군", "여주시", "연천군", "오산시", "용인시 기흥구", "용인시 수지구", "용인시 처인구", "의왕시", "의정부시", "이천시", "파주시", "평택시", "포천시", "하남시", "화성시"};
                            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(context, R.layout.spinner, spinner2_1);
                            spinner2.setAdapter(adapter2);

                            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                        }

                        else if(spinner1.getSelectedItem().toString().equals("경북")) {
                            String[] spinner2_1 = new String[]{"가평군", "고양시 덕양구", "고양시 일산동구","고양시 일산서구", "과천시", "광명시", "광주시", "구리시", "군포시", "김포시", "남양주시", "동두천시",
                                    "부천시", "성남시 분당구", "성남시 수정구", "성남시 중원구", "수원시 권선구", "수원시 영통구", "수원시 장안구", "수원시 팔달구", "시흥시", "안산시 단원구", "안산시 상록구", "안성시", "안양시 동안구",
                                    "안양시 만안구", "양주시", "양평군", "여주시", "연천군", "오산시", "용인시 기흥구", "용인시 수지구", "용인시 처인구", "의왕시", "의정부시", "이천시", "파주시", "평택시", "포천시", "하남시", "화성시"};
                            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(context, R.layout.spinner, spinner2_1);
                            spinner2.setAdapter(adapter2);

                            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                        }

                        else if(spinner1.getSelectedItem().toString().equals("경남")) {
                            String[] spinner2_1 = new String[]{"가평군", "고양시 덕양구", "고양시 일산동구","고양시 일산서구", "과천시", "광명시", "광주시", "구리시", "군포시", "김포시", "남양주시", "동두천시",
                                    "부천시", "성남시 분당구", "성남시 수정구", "성남시 중원구", "수원시 권선구", "수원시 영통구", "수원시 장안구", "수원시 팔달구", "시흥시", "안산시 단원구", "안산시 상록구", "안성시", "안양시 동안구",
                                    "안양시 만안구", "양주시", "양평군", "여주시", "연천군", "오산시", "용인시 기흥구", "용인시 수지구", "용인시 처인구", "의왕시", "의정부시", "이천시", "파주시", "평택시", "포천시", "하남시", "화성시"};
                            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(context, R.layout.spinner, spinner2_1);
                            spinner2.setAdapter(adapter2);

                            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                        }

                        else if(spinner1.getSelectedItem().toString().equals("전남")) {
                            String[] spinner2_1 = new String[]{"가평군", "고양시 덕양구", "고양시 일산동구","고양시 일산서구", "과천시", "광명시", "광주시", "구리시", "군포시", "김포시", "남양주시", "동두천시",
                                    "부천시", "성남시 분당구", "성남시 수정구", "성남시 중원구", "수원시 권선구", "수원시 영통구", "수원시 장안구", "수원시 팔달구", "시흥시", "안산시 단원구", "안산시 상록구", "안성시", "안양시 동안구",
                                    "안양시 만안구", "양주시", "양평군", "여주시", "연천군", "오산시", "용인시 기흥구", "용인시 수지구", "용인시 처인구", "의왕시", "의정부시", "이천시", "파주시", "평택시", "포천시", "하남시", "화성시"};
                            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(context, R.layout.spinner, spinner2_1);
                            spinner2.setAdapter(adapter2);

                            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                        }

                        else if(spinner1.getSelectedItem().toString().equals("광주")) {
                            String[] spinner2_1 = new String[]{"가평군", "고양시 덕양구", "고양시 일산동구","고양시 일산서구", "과천시", "광명시", "광주시", "구리시", "군포시", "김포시", "남양주시", "동두천시",
                                    "부천시", "성남시 분당구", "성남시 수정구", "성남시 중원구", "수원시 권선구", "수원시 영통구", "수원시 장안구", "수원시 팔달구", "시흥시", "안산시 단원구", "안산시 상록구", "안성시", "안양시 동안구",
                                    "안양시 만안구", "양주시", "양평군", "여주시", "연천군", "오산시", "용인시 기흥구", "용인시 수지구", "용인시 처인구", "의왕시", "의정부시", "이천시", "파주시", "평택시", "포천시", "하남시", "화성시"};
                            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(context, R.layout.spinner, spinner2_1);
                            spinner2.setAdapter(adapter2);

                            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                        }

                        else if(spinner1.getSelectedItem().toString().equals("전북")) {
                            String[] spinner2_1 = new String[]{"가평군", "고양시 덕양구", "고양시 일산동구","고양시 일산서구", "과천시", "광명시", "광주시", "구리시", "군포시", "김포시", "남양주시", "동두천시",
                                    "부천시", "성남시 분당구", "성남시 수정구", "성남시 중원구", "수원시 권선구", "수원시 영통구", "수원시 장안구", "수원시 팔달구", "시흥시", "안산시 단원구", "안산시 상록구", "안성시", "안양시 동안구",
                                    "안양시 만안구", "양주시", "양평군", "여주시", "연천군", "오산시", "용인시 기흥구", "용인시 수지구", "용인시 처인구", "의왕시", "의정부시", "이천시", "파주시", "평택시", "포천시", "하남시", "화성시"};
                            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(context, R.layout.spinner, spinner2_1);
                            spinner2.setAdapter(adapter2);

                            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                        }

                        else if(spinner1.getSelectedItem().toString().equals("제주")) {
                            String[] spinner2_1 = new String[]{"가평군", "고양시 덕양구", "고양시 일산동구","고양시 일산서구", "과천시", "광명시", "광주시", "구리시", "군포시", "김포시", "남양주시", "동두천시",
                                    "부천시", "성남시 분당구", "성남시 수정구", "성남시 중원구", "수원시 권선구", "수원시 영통구", "수원시 장안구", "수원시 팔달구", "시흥시", "안산시 단원구", "안산시 상록구", "안성시", "안양시 동안구",
                                    "안양시 만안구", "양주시", "양평군", "여주시", "연천군", "오산시", "용인시 기흥구", "용인시 수지구", "용인시 처인구", "의왕시", "의정부시", "이천시", "파주시", "평택시", "포천시", "하남시", "화성시"};
                            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(context, R.layout.spinner, spinner2_1);
                            spinner2.setAdapter(adapter2);

                            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                        }


                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Fragment1.location.setText(spinner1.getSelectedItem().toString() + " " + spinner2.getSelectedItem().toString() + " " +spinner3.getSelectedItem().toString());

                        dismiss();
                    }
                });

}
}





