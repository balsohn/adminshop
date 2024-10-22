<%@ page import="java.sql.*, java.util.Random" %>
<%
    // 데이터베이스 연결 정보
    String jdbcUrl = "jdbc:mysql://localhost:3306/second";
    String dbUser = "root";
    String dbPassword = "1234";

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
        // JDBC 드라이버 로드
        Class.forName("com.mysql.jdbc.Driver");

        // 데이터베이스 연결
        conn = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);

        // NULL 값을 랜덤 값으로 업데이트
        String selectQuery = "SELECT id FROM pageboard WHERE type IS NULL";
        pstmt = conn.prepareStatement(selectQuery);
        rs = pstmt.executeQuery();

        Random random = new Random();

        while (rs.next()) {
            int id = rs.getInt("id");
            int randomType = random.nextInt(4); // 0부터 3까지의 랜덤 값 생성

            String updateQuery = "UPDATE pageboard SET type = ? WHERE id = ?";
            PreparedStatement updatePstmt = conn.prepareStatement(updateQuery);
            updatePstmt.setInt(1, randomType);
            updatePstmt.setInt(2, id);
            updatePstmt.executeUpdate();
            updatePstmt.close();
        }

        out.println("NULL 값을 랜덤 숫자로 성공적으로 업데이트하였습니다.");

    } catch (Exception e) {
        e.printStackTrace();
        out.println("오류가 발생하였습니다: " + e.getMessage());
    } finally {
        // 리소스 해제
        if (rs != null) try { rs.close(); } catch (SQLException ignore) {}
        if (pstmt != null) try { pstmt.close(); } catch (SQLException ignore) {}
        if (conn != null) try { conn.close(); } catch (SQLException ignore) {}
    }
%>
