# KYC
<h2>💎Project Overview</h2>

 The household book service allows users to link to their Ethereum and polygon network addresses to record and track gas fees incurred when performing transactions. This allows users to see the cost of gas for each transaction they perform in real time, which helps them optimize costs and manage assets efficiently. In addition, the household book service provides the ability to store transaction content and gas costs and look them up later. This allows users to effectively manage and analyze their transaction history.

 Stacking services provide users with the ability to perform staking on Ethereum and polygon networks. Users can contribute to the network by staking their assets, and receive rewards for it. The Staking Service works with the staking protocol of your choice to provide information about receiving and staking rewards. Users can view and manage their staking revenue and reward history, which maximizes asset growth and revenue.

 Our project provides users with the ability to transparently check information about gas fees and staking, and manage assets efficiently based on it. Household bookkeeping services and staking services using Ethereum and polygon networks enable users to realize reliable and profitable cryptocurrency asset management.

<br />
<h2>💁🏻‍♂️What is the problem?</h2>

 The motivation for us to plan and implement this project came from several inspirations. First, blockchain platforms such as Ethereum and Polygon are gaining popularity around the world, and the development and use of digital assets and smart contracts are rapidly increasing. However, users of these platforms often find it difficult to quickly determine gas fees for their transactions and operations. This can be confusing for users and makes it difficult to manage costs efficiently.

 Second, staking on blockchain networks is providing users with additional revenue. However, to start or manage staking, users must check and calculate the network one by one. As a result, users may have difficulty identifying information related to staking and may miss it.

<br />
<h2>⚒️We've come up with this solution.</h2>

Our household book service gives you a quick, at-a-glance look at users' gas fees on Ethereum and polygon networks. This allows users to clearly see the gas fees spent on each transaction and operation, and efficiently track costs for better asset management.

In addition, we provide a staking service so that users can conveniently obtain information about staking on the blockchain network. Our services make it easy for users to check the information they need for staking, and help them start or manage staking. This allows users to maximize their earnings from staking without missing out.

The following is a description of the features that we implemented:

1. **Gas Fee Circular Statistics Table**: The Household Book Service analyzes a user's transaction method (transfer, swap, probe, etc.) and presents the total amount of gas fees used by a specific user in the month as a circular statistics table. This allows users to compare gas costs for each type of transaction and manage costs efficiently.
2. **Gas Usage Calendar**: The Household Book Service includes a calendar function. The calendar allows users to see the total amount of gas used per day by day. In addition, clicking on a specific date allows users to view a list of all transactions that occurred on that date, so that they can get a detailed history of gas usage.

<br />
**<h2>📺User Flow</h2>**
![가계부](https://github.com/Stray-Dogs-E1I3/KYC_Back_End/assets/84958769/c804cdb7-8ca7-454c-ae70-1d91e130e59c)

<br />
<h2>📚Used Luniverse Tool</h2>

**[Web3 Multichain API]**

The Web3 Multi-Chain API was used to query the wallet address of a specific user for transactions occurring through various activities in Ethereum and Polygon.

**[Web3 Engine - Webhook]**

When a specific user logs in with a wallet, the wallet address becomes subscriptionId and creates a webhook. If a user makes a transaction in Ethereum, polygon, the change is automatically transferred to the KYC-server from the Luniverse-webbook-server and stored in the DB.

**[WEB3 Engine - JSONRPC]**

The transaction type was classified through the transaction method ID using the RPC endpoint of node generated by the Luniverse.

**[Deploy Contract - Luniverse Node]**

After testing with hardhat, the contract was deployed to the Polygon Mumbai network using the ****Luniverse Node.

<br />
<h2>💡We get these expected results</h2>

 Our project provides a variety of features that help users manage their assets and pursue maximum profits. This allows users to gain transparency about their activities on the blockchain network and manage costs effectively to keep their assets safe.

<br />
<h2>🚨ISSUE occurred during development</h2>
1️⃣Failed to receive notification of transaction success when creating webhook with polygon Mumbai network (Sefolia network works well)
<br />
2️⃣We encountered a CORS error when making JSON-RPC call to the Luniverse Node from the web. We couldn't resolve the CORS error, so we used a different node.
<br /><br />

<h2>🎨 Architecture</h2>
<img src="https://github.com/Stray-Dogs-E1I3/KYC_Front-end/assets/89543695/1b16ffcb-ca75-461d-b8b4-057d4ce9b19f" width="550px" height="350px" />
<br /><br />

<h2>👨‍👨‍👦‍👦 Team - We are E1I3!</h2>

- Front-End Developer : PARK JUN HYUK
- Back-End Developer : JUNG HYUN WOO, KIM HYUNG CHAN
- Smartcontract : CHOI HYUN SEOK


![가계부](https://github.com/Stray-Dogs-E1I3/KYC_Back_End/assets/84958769/c804cdb7-8ca7-454c-ae70-1d91e130e59c)
