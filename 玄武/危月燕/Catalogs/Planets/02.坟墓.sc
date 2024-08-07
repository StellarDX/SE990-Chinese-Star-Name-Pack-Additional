// Object * 34 Peg  ---  Spectroscopic Binary  ---  OID=@1400455   (@@28937,11)  ---  coobox=9391 
// Object types: Rotating Variable,High Proper Motion Star,Spectroscopic Binary,Spectroscopic Binary,Spectroscopic Binary,High Proper Motion Star,Spectroscopic Binary,Double or Multiple Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Star,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=ADS&number=15935
Barycenter "34 Peg A"
{
	ParentBody      "34 Peg"
	BinaryOrbit // Tok 2020, poorly constrained
	{
		Period          670
		Separation      102.398085237545 // 2.550 asec
		Eccentricity    0.698
		Inclination     75.4
		AscendingNode   41.4
		Epoch           2370095.523069936782122
		ArgOfPericenter 29.3
		MeanAnomaly     0
	}
}

Star "34 Peg Aa"
{
	DateUpdated     "2024-06-13"
	ParentBody      "34 Peg A"
	Class           "F7V"
	AbsMagn         2.85
	MassSol         1.33
	RadSol          2.25
	LumBol          6.7
	Teff            6200
	FeH             -0.04
	Age             3.22

	BinaryOrbit // SB9_3511 2016AJ....152...46W (Combined)
	{
		PeriodDays      929.91
		SemiMajorAxisKm 5.824E7 // 0.011 asec
		Eccentricity    0.4358
		Inclination     94.0
		AscendingNode   101.6
		Epoch           2453293.898
		ArgOfPericenter 188.5
		MeanAnomaly     0
	}
}

Star "34 Peg Ab"
{
	DateUpdated     "2024-06-13"
	ParentBody      "34 Peg A"
	Class           ""
	MassSol         0.29
}

Star "34 Peg B"
{
	DateUpdated     "2024-06-13"
	ParentBody      "34 Peg"
	Class           "K4"
	MassSol         0.56
}

// Object * 37 Peg  ---  Double or Multiple Star  ---  OID=@1400462   (@@28938,3)  ---  coobox=9391 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=ADS&number=15988
Barycenter "37 Peg AB"
{
	ParentBody      "37 Peg"
	BinaryOrbit     
	{
		Period          179507
		Separation      5101.72353575896 // 96.82 asec
	}
}

// Object * 37 Peg A  ---  High Proper Motion Star  ---  OID=@1400463   (@@28939,0)  ---  coobox=9391 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "37 Peg A/ADS 15988 A/BD+03 4713A/CSI+03 4713 2/WDS J22300+0426A/Renson 59110/TYC 563-782-1/HD 213235A"
{
	DateUpdated     "2024-06-13"
	ParentBody      "37 Peg AB"
	Class           "F8(V)"
	AbsMagn         2.09 // 计算的值
	MassKg          3.0158188562976e+30 // log(g) = 3.679 cm/s^2
	RadSol          2.951097 // Gaia DR3
	LumBol          16.5895889357319 // 计算的值
	Teff            6781
	FeH             -0.254
}

// Object * 37 Peg B  ---  High Proper Motion Star  ---  OID=@5447368   (@@-1,255)  ---  coobox=9391 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Barycenter "37 Peg B/HD 213235B/WDS J22300+0426B/ADS 15988 B/BD+03 4713B/CCDM J22300+0426B/CSI+03 4713 3/TYC 563-782-2"
{
	ParentBody      "37 Peg AB"
	BinaryOrbit // Tok 2021
	{
		Period          123.5300
		Separation      37.6224497205645 // 0.714 asec
		Eccentricity    0.515
		Inclination     89.9
		AscendingNode   117.1
		Epoch           2464466.802390971686691
		ArgOfPericenter 214.6
		MeanAnomaly     0
	}
}

Star "37 Peg Ba"
{
	DateUpdated     "2024-06-13"
	ParentBody      "37 Peg B"
	Class           "" // A4(V)
	AbsMagn         3.98 // 计算的值
	MassSol         1.06

	BinaryOrbit // Tok 2021
	{
		Period          2.1130
		Separation      2.16380392906004 // 0.041 asec
		Eccentricity    0.193
		Inclination     113.1
		AscendingNode   86.9
		Epoch           2457607.553897864650935
		ArgOfPericenter 331.3
		MeanAnomaly     0
	}
}

Star "37 Peg Bb"
{
	DateUpdated     "2024-06-13"
	ParentBody      "37 Peg B"
	Class           ""
	MassSol         1.00
}

// Object Gaia DR3 2704384333258549760  ---  High Proper Motion Star  ---  OID=@23341883   (@@-1,255)  ---  coobox=9391 
// Object types: High Proper Motion Star,Star 
Star "Gaia DR3 2704384333258549760"
{
	DateUpdated     "2024-06-13"
	ParentBody      "37 Peg"
	Parallax        18.248
	Class           ""
	MassSol         0.39
}