# Drills — Week 2

Two small problems. Twenty minutes, not two hours. They exist so you arrive at Tuesday's
class having already written some Java, not so you suffer.

**These are the same two problems you would solve in Python without thinking.** That is
deliberate — the difficulty here is Java's syntax, not the algorithm. If you find
yourself stuck on *what* to do rather than *how to say it in Java*, re-read the problem;
it is simpler than you think.

---

## How to work

```
./mvnw test          # macOS / Linux
mvnw.cmd test        # Windows
```

Both drills fail when you start. Make them pass.

```
write  →  ./mvnw test  →  commit  →  push  →  open a pull request
```

**The pull request is the submission.** CI runs on it and shows a green check or a red X.

---

## Drill 1 — Asterisks

`src/main/java/drills/Asterisks.java`

Return a string containing exactly `n` asterisks.

| `n` | returns |
|---|---|
| `5` | `*****` |
| `10` | `**********` |
| `0` | `""` — the empty string, **not** `null` |

---

## Drill 2 — Show me the Numbers

`src/main/java/drills/ShowMeTheNumbers.java`

Return the numbers `1` through `n`, each followed by a newline.

| `n` | returns |
|---|---|
| `5` | `"1\n2\n3\n4\n5\n"` |
| `1` | `"1\n"` |
| `0` | `""` — the empty string, **not** `null` |

Every number is followed by a newline, **including the last one**.

> **Use `"\n"`, not `System.lineSeparator()`.** The tests compare against `"\n"` exactly.
> On Windows `lineSeparator()` gives you `"\r\n"` and every test fails for a reason that
> is invisible when you look at the output.

---

## Two things Java does that Python does not

Both drills return a **`String`**, and both start life returning `null`.

`null` means "no object here at all". It is not the same as `""`, the empty string, which
is a real string that happens to have no characters in it. Returning `null` where a string
is expected is how you get a `NullPointerException` — the single most common runtime error
in Java, and one Python does not have in this form.

Building a string a piece at a time with `+` inside a loop works, and for a drill this size
it is fine. It is also the thing that gets rewritten first in real code, because each `+`
makes a whole new string. Look up `StringBuilder` if you are curious — not required.

---

## If something goes wrong

| Symptom | Fix |
|---|---|
| `./mvnw: Permission denied` | `chmod +x mvnw`, then try again |
| Windows: `./mvnw` does nothing | The command is `mvnw.cmd test`, without the `./` |
| First run takes forever | Normal, once. Maven is downloading |
| `expected: <> but was: <null>` | Your method still returns `null`. That is the stub — replace it |
| Drill 2 fails and the output looks identical | You are probably missing the newline after the **last** number, or using `System.lineSeparator()` |
| Tests pass locally, CI is red | You committed but did not push, or pushed to the wrong branch |

---

## Using AI on this — and what to use instead

**Tier 0 — no AI.** These take twenty minutes and they are practice for you, not output
for anyone. A model writes both in one second, and you will have learned nothing that
shows up on **Thursday's quiz**, which is closed-book and on paper.

**"No AI" does not mean "no help."** Use any of these:

| | |
|---|---|
| **Think Java** — [§6.1 The `while` Statement](https://books.trinket.io/thinkjava2/chapter6.html) · [§6.3 The `for` Statement](https://books.trinket.io/thinkjava2/chapter6.html) | free, no signup |
| **Think Java** — [§6.7 String Iteration](https://books.trinket.io/thinkjava2/chapter6.html) for building a string in a loop | free |
| **Bro Code** — [the channel](https://www.youtube.com/@BroCodez) · [Java Full Course](https://www.youtube.com/watch?v=xTtL8E4LzTQ) (chaptered — jump to loops) | free |
| **Tutoring** | two hours a week, already required, **10% of your grade**. Bring this repo |
| **Office hours** | bring the failing test and what you already tried |
| **Your classmates** | talk it through, explain it to each other — **type your own code** |

**And the technique that beats all of them:** write the Python version first, in a comment,
then translate it line by line. The algorithm is not the hard part here and never was —
the difference between your Python and your Java is the whole lesson.
