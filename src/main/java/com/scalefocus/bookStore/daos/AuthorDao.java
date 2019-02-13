package com.scalefocus.bookStore.daos;

public class AuthorDao extends AbstractDao {

//	public String getAuthorNameByBookId(Integer id) {
//		final String sql = "select author.name from author inner join books on author.id=books.authorId where books.id = ?";
//		final String authorName = DatabaseService.getInstance().getJdbcTemplate().queryForObject(sql,
//				new Object[] { id }, String.class);
//		return authorName;
//	}
//
//	public List<Authors> getAuthorsInBookstore() {
//		final List<Authors> authorsList = DatabaseService.getInstance().getJdbcTemplate().query("select * from author",
//				new AuthorsMapper());
//		return authorsList;
//	}

}
