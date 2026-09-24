import 'dart:convert';
import 'package:http/http.dart' as http;

class ApiService {
  // Note: 10.0.2.2 is the special IP Android emulators use to reach your computer's localhost.
  // If you run this as a Windows desktop app instead of Android, change it to 'http://localhost:8080/api'.
  static const String baseUrl = 'http://localhost:8080/api';

  Future<List<dynamic>> getClients() async {
    final response = await http.get(Uri.parse('$baseUrl/clients'));

    if (response.statusCode == 200) {
      return json.decode(response.body);
    } else {
      throw Exception('Failed to load clients');
    }
  }
}