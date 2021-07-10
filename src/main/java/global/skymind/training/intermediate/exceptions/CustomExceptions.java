/*
 * Copyright (c) 2020-2021 Skymind Education Group Sdn. Bhd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.

 * SPDX-License-Identifier: Apache-2.0
 */
package global.skymind.training.intermediate.exceptions;

public class CustomExceptions {
    public String checkName(String name) throws NameNotFoundException {
        if(name.length() != 0) {
            /*
            Enter your code here
             */
        }
        throw new NameNotFoundException("No name is found, please try again");
    }

    public boolean isUpperCase(String str) throws NotUpperCaseException, NullPointerException {
        String upper = str.toUpperCase();
        if(upper.equals(str)) {
            /*
            Enter your code here
             */

        }
        throw new NotUpperCaseException((str + " is not in uppercase"), new Throwable("Not UPPERCASE"));
    }

    public boolean isPalindrome(String str) throws NotPalindromeException, NullPointerException {
        int j = str.length() - 1;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(j)) {
            /*
            Enter your code here
             */

            }
        }
        return true;
    }

    public boolean isInteger(Number a) throws NotIntegerException {
        if(a instanceof Integer) {
            /*
            Enter your code here
             */
        }
        throw  new NotIntegerException((a.toString() + "is not an Integer"), new Throwable("Not INTEGER"), false, true);
    }

}

class NameNotFoundException extends Exception {
    public NameNotFoundException(String message) {
        super(message);
    }
}

class NotUpperCaseException extends Exception {
    public NotUpperCaseException(String message, Throwable cause) {
        super(message, cause);
    }
}

class NotPalindromeException extends Exception {
    public NotPalindromeException(Throwable cause) {
        super(cause);
    }
}

class NotIntegerException extends Exception {
    public NotIntegerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}