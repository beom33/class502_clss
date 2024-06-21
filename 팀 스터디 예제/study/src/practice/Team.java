package practice;

public class Team {
    int teamID;
    String teamName;
    int grade;
    String address;

    public String getTeamName() {

        return teamName;
    }

    public static void main(String[] args) {
        Team team = new Team(); // 팀 클래스 생성
        team.teamName = "첼시";

        System.out.println(team.teamName);
        System.out.println(team.getTeamName());
    }
    }