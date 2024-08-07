// Object * alf Cir  ---  alpha2 CVn Variable  ---  OID=@3380497   (@@67041,0)  ---  coobox=22104 
// Object types: High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,Variable Star,alpha2 CVn Variable,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "ALF Cir A" {ParentBody "ALF Cir"}
Remove "ALF Cir B" {ParentBody "ALF Cir"}
Star "ALF Cir A"
{
	DateUpdated     "2024-05-22"
	ParentBody      "HIP 71908"
	Class           "A7VpSrCrEu"
	AbsMagn         2.18
	MassSol         1.5 // 1.7
	RadSol          1.967
	LumBol          10.51
	Teff            7500
	FeH             0.13
	RotationPeriod  107.496
	Age             0.012

	BinaryOrbit     
	{
		Separation      255.439147892833 // 15.58 asec
	}
}

// Object * alf Cir B  ---  High Proper Motion Star  ---  OID=@3380491   (@@67019,16)  ---  coobox=22104 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star 
Star "ALF Cir B/GJ 560 B/Gaia DR3 5849837820492182272/TIC 402558381/CCDM J14425-6459B/CD-64 867B/CPD-64 2977B/CSI-64 2977 42/GC 19771/GCRV 5068 E/GEN# +1.00128898B/IDS 14344-6432 B/LTT 5826/NLTT 38065/SAO 252852/UBV 12776/2MASS J14422861-6458413/WDS J14425-6459B/WEB 12385/Gaia DR2 5849837820492182272"
{
	DateUpdated     "2024-05-22"
	ParentBody      "HIP 71908"
	Parallax        60.8225
	AppMagn         8.47
	Class           "K5V"
	AbsMagn         7.39 // 计算的值
}