const express = require('express');
const mysql = require('mysql2/promise');

const app = express();
app.use(express.json());

const db = mysql.createPool({
  host: 'localhost',
  user: 'root',
  password: 'password',
  database: 'database_name'
});

// API endpoints
app.get('/users', getUsers);
app.get('/users/:id', getUser);
app.post('/users', createUser);

app.get('/posts', getPosts);
app.get('/posts/:id', getPost);
app.post('/posts', createPost);

app.get('/comments', getComments);
app.get('/comments/:id', getComment);
app.post('/comments', createComment);

app.get('/likes', getLikes);
app.get('/likes/:id', getLike);
app.post('/likes', createLike);

app.get('/feed', getFeed);

// API implementations
async function getUsers(req, res) {
  const [rows] = await db.execute('SELECT * FROM users');
  res.json(rows);
}

async function getUser(req, res) {
  const id = req.params.id;
  const [rows] = await db.execute('SELECT * FROM users WHERE id = ?', id);
  res.json(rows[0]);
}

async function createUser(req, res) {
  const { username, password } = req.body;
  const [results] = await db.execute('INSERT INTO users (username, password) VALUES (?, ?)', username, password);
  res.json({ id: results.insertId });
}

async function getPosts(req, res) {
  const [rows] = await db.execute('SELECT * FROM posts');
  res.json(rows);
}

async function getPost(req, res) {
  const id = req.params.id;
  const [rows] = await db.execute('SELECT * FROM posts WHERE id = ?', id);
  res.json(rows[0]);
}

async function createPost(req, res) {
  const { content, user_id } = req.body;
  const [results] = await db.execute('INSERT INTO posts (content, user_id) VALUES (?, ?)', content, user_id);
  res.json({ id: results.insertId });
}

async function getComments(req, res) {
  const [rows] = await db.execute('SELECT * FROM comments');
  res.json(rows);
}

async function getComment(req, res) {
  const id = req.params.id;
  const [rows] = await db.execute('SELECT * FROM comments WHERE id = ?', id);
  res.json(rows[0]);
}

async function createComment(req, res) {
  const { content, post_id, user_id } = req.body;
  const [results] = await db.execute('INSERT INTO comments (content, post_id, user_id) VALUES (?, ?, ?)', content, post_id, user_id);
  res.json({ id: results.insertId });
}

async function getLikes(req, res) {
  const [rows] = await db.execute('SELECT * FROM likes');
  res.json(rows);
}

async function getLike(req, res) {}
  const id = req.params